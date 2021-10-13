package pr5

object Pr5Again {
    @JvmStatic
    fun main(args: Array<String>) {
        val number = 10

        val percentage =
            if (number in 0..100)
                number
            else
                throw IllegalArgumentException("Percentage must be between 0 to 100: $number")

        println(percentage)

        val another = try {
            Integer.parseInt("throw it")
        }catch (e:Exception){
            null
        }

        if (another == null)
            throw IllegalArgumentException("I throw the exception here not where it happened.")
    }
}