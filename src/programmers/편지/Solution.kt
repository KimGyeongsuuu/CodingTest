package programmers.편지

class Solution {
    fun solution(message: String): Int {
        var answer: Int = 0
        answer = message.length * 2
        return answer
    }
}
fun main() {
    val s = Solution()
    print(s.solution("happy birthday!"))
}