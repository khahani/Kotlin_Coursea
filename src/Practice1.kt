class Practice1 {
    fun doMethod(degrees: Int) {
        val (description, color) = when {
            degrees < 10 -> "blue" to Color.blue
            degrees < 25 -> "orange" to Color.orange
            else -> "red" to Color.red
        }

        rootFun()
    }
}

fun rootFun() {
    val name = "Kotlin"
    println("hello $name")
    println(
        "hello ${
            if (name.length < 10) {
                "Less than 10"
            } else {
                "Larger than 10"
            }
        }"
    )
}
