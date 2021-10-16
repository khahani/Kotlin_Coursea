package pr6

object Pr6 {
    data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

    fun evaluateGuess(secret: String, guess: String): Evaluation {

        val rightPositions = secret.zip(guess).count { p -> p.first == p.second }

        val commonLetters = "ABCDEF".sumBy { ch ->
            Math.min(secret.count { s -> s == ch }, guess.count { g -> g == ch })
        }
        return Evaluation(rightPositions, commonLetters - rightPositions)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val result = Evaluation(rightPosition = 1, wrongPosition = 1)
        evaluateGuess("BCDF", "ACEB") eq result
        evaluateGuess("AAAF", "ABCA") eq result
        evaluateGuess("ABCA", "AAAF") eq result
    }
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
