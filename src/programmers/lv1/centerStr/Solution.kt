package programmers.lv1.centerStr

class Solution {
    fun solution(s: String): String {
        s.toCharArray()
        var answer = ""
        answer = if (s.length % 2 == 1) {
            s[s.length/2].toString()
        } else {
            s[s.length/2-1].toString() + s[s.length/2].toString()
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution("abcdef")
    println(sol)
}