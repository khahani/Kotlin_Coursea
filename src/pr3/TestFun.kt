@file:JvmName("root")
package pr3

@JvmOverloads
fun testIt(a: Int = 0, b: Int = 0, c: Int = 0) {

}

fun callIt() {
    testIt()
    testIt(1)
    testIt(b=1)
    testIt(1,2,3)
    testIt(b=2, a=4)
}