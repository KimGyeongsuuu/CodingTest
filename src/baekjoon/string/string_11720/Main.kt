package baekjoon.string.string_11720

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val str = sc.next()
    var sum = 0
    for (i in 0 until n){
        sum+=str[i].toString().toInt()
    }
    println(sum)
}