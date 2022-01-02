package chap05.section2

fun main() {
    print("Enter the lines: ")
    val input: Int = readLine()!!.toInt()

    for (i in 1..input) {
        for (j in 1..input - i) print(" ")
        for (k in 1 until i * 2) print("*")
        println()
    }
}