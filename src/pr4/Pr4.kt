package pr4
//Implement the function that checks whether a string is a valid identifier.
// A valid identifier is a non-empty string that starts with a letter or
// underscore and consists of only letters, digits and underscores.
object Pr4 {
    @JvmStatic
    fun main(args: Array<String>) {
        runTests()
    }

    private fun runTests() {
        val tests = arrayListOf<Pair<Boolean, Boolean>>()

        tests.add(isValid("") to false)
        tests.add(isValid("012") to false)
        tests.add(isValid("no$") to false)
        tests.add(isValid("_name") to true)
        tests.add(isValid("name") to true)
        tests.add(isValid("_12") to true)

        for ((i, t) in tests.withIndex())
            if (t.first != t.second) {
                println("Test ${i + 1} failed")
                return
            }
        println("All the ${tests.size} tests passed.")
    }

    private fun isValid(s: String): Boolean {
        if (s.isEmpty())
            return false

        for ((i, c) in s.withIndex()) {
            if (i == 0) {
                if ( c == '_' || c.isLetter())
                    continue
                else
                    return false
            }

            if (!c.isLetter() && !c.isDigit() && c!='_')
                return false
        }
        return true
    }


}