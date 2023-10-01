package programmers.약수의개수와덧셈

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var count = 0
        for (i in left .. right) {
            for (j in 1..i) {
                if (i % j == 0) {
                    count++
                }
            }
            answer += if (count % 2 == 0) i else i * -1
            count=0
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(13,17)
    println(sol)
}