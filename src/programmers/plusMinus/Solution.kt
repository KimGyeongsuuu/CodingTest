package programmers.plusMinus

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for (i in absolutes.indices) {
            val value = if (signs[i]) absolutes[i] else -absolutes[i]
            answer+=value
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true))
    println(sol)
}