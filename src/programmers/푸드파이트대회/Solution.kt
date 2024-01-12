package programmers.푸드파이트대회

class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var count: Int = 0
        for (i in 1 until food.size) {
            if (food[i] / 2 > 0) {
                count = if (food[i] % 2 == 0) {
                    food[i] / 2
                } else {
                    (food[i] - 1) / 2
                }
                for (j in 0 until count) {
                    answer+=i.toString()
                }
            }
        }
        answer+="0"+answer.reversed()
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(1,7,1,2))
    println(sol)
}