package programmers.덧칠하기

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var k = 0
        for (i in section) {
            if (i > k) {
                k += m - 1
                answer++
            }
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(4,1, intArrayOf(1,2,3,4))
    println(sol)
}