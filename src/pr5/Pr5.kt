package pr5

// exception
object Pr5 {
    @JvmStatic
    fun main(args: Array<String>) {
        var number = 50

        val percentage = if (number in 0..100)
            number
        else
            throw IllegalArgumentException("A percentage must be " +
                    "a value between 0 and 100: $number")

        println(number)
        println(percentage)

        val num2 = try {
            Integer.parseInt("12")
        } catch (e: Exception) {
            null
        }

        if (num2 == null)
            throw IllegalArgumentException("I use the exception whenever I need it!")
    }
}