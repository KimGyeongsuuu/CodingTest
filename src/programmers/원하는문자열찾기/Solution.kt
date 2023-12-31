package programmers.원하는문자열찾기

class Solution {
    fun solution(myString: String, pat: String): Int = if (myString.uppercase().contains(pat.uppercase())) 1 else 0

}
fun main() {
    val s = Solution()
    val sol = s.solution("AbCdEfG", "aBc")
    println(sol)
}