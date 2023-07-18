package programmers.lv1.문자열다루기기본

class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if(s.length != 4 && s.length != 6) {
            return false
        }
        for (c in s) {
            if (c.toInt() in 65..90 || c.toInt() in 97 ..122) {
                return false
            }
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution("54321")
    println(sol)
}