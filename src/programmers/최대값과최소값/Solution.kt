package programmers.최대값과최소값

class Solution {
    fun solution(s: String): String = s.split(" ").map { it.toInt() }.let { "${it.min()} ${it.max()}" }

}
fun main() {
    val s = Solution()
    val sol = s.solution("1 2 3 4")
    println(sol)
}