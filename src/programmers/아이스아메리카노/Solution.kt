package programmers.아이스아메리카노

class Solution {
    fun solution(money: Int): IntArray {
        val answer = IntArray(2)
        answer[0] = money / 5500
        answer[1] = money % 5500
        return answer
    }
}
fun main() {
    val s = Solution()
    s.solution(5500)
}