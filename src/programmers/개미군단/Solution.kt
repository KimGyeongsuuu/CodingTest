package programmers.개미군단

class Solution {
    fun solution(hp: Int): Int = hp/5 + (hp%5 /3) + (hp % 5 % 3)
}
fun main() {
    val sol = Solution()
    val s = sol.solution(23)
    println(s)
}