package programmers.caesar

class Solution {
    fun solution(s: String, n: Int): String {
        return s.map {
            if (it.toInt() == 32) {
                it.toChar()
            }
            else if (it.toInt() + n < 123) {
                (it.toInt() + n).toChar()
            } else {
                (it.toInt()-26 + n).toChar()
            }
        }.joinToString("")
    }
}
fun main(){
    val s = Solution()
    val sol = s.solution("a B z",4)
    println(sol)
}