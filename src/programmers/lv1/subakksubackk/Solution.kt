package programmers.lv1.subakksubackk


class Solution {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 1..n)
            answer += if (i % 2 == 1) {
                "수"
            } else {
                "박"
            }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(4)
    println(sol)

}