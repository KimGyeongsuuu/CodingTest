package programmers.JadenCase문자열만들기

class Solution {
    fun solution(s: String) = s.lowercase().split(" ").map { it.capitalize() }.joinToString(" ")
}
fun main() {
    val s = Solution()
    val sol = s.solution("people unFollowed me")
    println(sol)
}