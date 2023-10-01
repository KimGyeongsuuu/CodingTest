package programmers.fruiterer

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var count = 0
        score.sortDescending()
        while (count + m - 1 < score.size) {
            answer += score[count + m - 1] * m
            count+=m
        }
        return answer
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution(3,4, intArrayOf(1, 2, 3, 1, 2, 3, 1))
    println(sol)
}