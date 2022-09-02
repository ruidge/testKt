package test2

import View

class WareInfo {
    var sku: String? = null
    var name: String? = null
    var price: String? = null
    var addCartFun: ((sku: String, ((sku: String, success: Boolean) -> Unit)?) -> Unit)? = null
    var doFinallyFun: ((Boolean) -> Unit)? = null
}


class WareView {

    var view: View? = null

    fun setData(info: WareInfo?) {
        view?.setOnClickListener() {
            info?.addCartFun?.invoke(info.sku!!) { sku, success ->
                if (success) {
                    anim()
                }
                info.doFinallyFun?.invoke(true)
            }
        }
    }

    fun anim() {

    }

}

class WareController {

    var wareView: WareView? = null
    var wareInfo: WareInfo? = null

    fun setView() {
        wareInfo?.addCartFun =
            { sku: String, callback: ((sku: String, success: Boolean) -> Unit)? ->
                addCart(sku, callback)
            }
        wareInfo?.doFinallyFun =
            { result: Boolean ->
                doFinally()
            }
        wareView?.setData(wareInfo)
    }

    fun addCart(sku: String, callback: ((sku: String, success: Boolean) -> Unit)?) {
        Thread() {
            //net
            callback?.invoke(sku, true)
        }.start()
    }

    fun doFinally() {}

}