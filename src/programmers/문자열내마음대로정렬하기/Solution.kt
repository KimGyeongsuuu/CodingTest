package programmers.문자열내마음대로정렬하기

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> =
        strings.sortedWith(compareBy({it[n]}, {it})).toTypedArray()
}

fun main() {
    val s = Solution()
    val sol = s.solution(arrayOf("sun", "bed", "car"), 1)
    println(sol)
}