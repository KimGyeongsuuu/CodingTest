package programmers.덧칠하기

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1
        var value = 0
        for (i in 1 until section.size) {
            value+=section[section.size-i]-section[section.size-i-1]
        }
        if (value >= m) {
            answer += value / m
        }
        if (answer > section.size) {
            answer = section.size
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(5,5, intArrayOf(3))
    println(sol)
}