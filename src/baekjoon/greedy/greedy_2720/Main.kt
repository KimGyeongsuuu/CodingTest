package baekjoon.greedy.greedy_2720

import java.util.Scanner


fun main() {
    var sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val array: Array<Array<Int>> = Array(n) { Array(4) { 0 } }
    for (i in 0 until n){

        var num = sc.nextInt()

        var quarter = num / 25
        num %= 25

        var dime = num / 10
        num %= 10

        var nickel = num / 5
        num %= 5

        var penny = num / 1
        num %= 1

        array[i][0] = quarter
        array[i][1] = dime
        array[i][2] = nickel
        array[i][3] = penny
    }
    for(i in 0 until n){
        for (j in 0..3){
            print(array[i][j])
            print(" ")
        }
        println()
    }

}