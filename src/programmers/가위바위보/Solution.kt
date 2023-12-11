package programmers.가위바위보

class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        rsp.toCharArray().contentToString()
        rsp.map {
            when (it) {
                '2' -> answer+="0"
                '0' -> answer+="5"
                '5' -> answer+="2"
                else -> {}
            }
        }
        return answer
    }
}
fun main() {
    val solution = Solution()
    println(solution.solution("205"))
}