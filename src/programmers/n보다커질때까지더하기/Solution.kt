package programmers.n보다커질때까지더하기

class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        numbers.map {
            answer+=it
            if (answer > n) {
                return answer
            }
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(34, 5, 71, 29, 100, 34), 123)
    println(sol)
}