package programmers.`2016년`


class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val lastDay = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dayOfWeek = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        val sum = (0 until a-1).map {
            lastDay[it]
        }.sum() + b

        return dayOfWeek[sum % 7]
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(5, 24)
    println(sol)
}