object C {
    fun fibonacci(): Sequence<Int> = sequence {
        var a = 0
        var b = 1
        while (true) {
            if (a == 0)
                yield(a)

            if (a == 0 && b == 1)
                yield(b)

            yield(a + b)
            val t = b
            b += a
            a = t
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(
            "${fibonacci().take(4).toList().toString()} <> [0, 1, 1, 2]"
        )

        println(
            "${fibonacci().take(10).toList().toString()} <> [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
        )
    }
}