import com.google.gson.Gson

/**
 * @author: rui.zhang1
 * @date: 2024/3/19
 * @email: rui.zhang1@dmall.com
 * @description:
 */


fun printGson(obj: Any) {
    println(Gson().toJson(obj))
}