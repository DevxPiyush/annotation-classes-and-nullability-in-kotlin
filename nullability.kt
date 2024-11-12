
fun main() {
    var message: String? = "hello world"

    message = null
    if (message != null) {
        var length = message.length
        println(length)
    } else {
        println(null)
    }
}