package programmers.star

fun main() {
    val (a, b) = readln().split(' ').map(String::toInt)
    for (i in 0 until b) {
        for (j in 0 until a) {
            print("*")
        }
        println()
    }
}