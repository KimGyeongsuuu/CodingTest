package baekjoon.greedy.greedy_5585

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val price = scanner.nextInt()
    var change = 1000 - price
    var count = 0

    count += change / 500
    change %= 500

    count += change / 100
    change %= 100

    count += change / 50
    change %= 50

    count += change / 10
    change %= 10

    count += change / 5
    change %= 5

    count += change

    println(count)
}