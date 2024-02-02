package programmers.caesar

class Solution {
    fun solution(s: String, n: Int): String {
        return s.map {
            if (it.toInt() == 32) { // 빈칸 일때
                it.toChar()
            } else if (it.toInt() in 97..122 && it.toInt() + n in 97..122) { // 소문자 일때
                (it.toInt() + n).toChar()
            } else if (it.toInt() in 65..90 && it.toInt() + n in 65..90) { // 대문재 일때
                (it.toInt() + n).toChar()
            } else {
                (it.toInt()-26 + n).toChar()
            }
        }.joinToString("")
    }
}
fun main(){
    val s = Solution()
    val sol = s.solution("ABCDEFGHIJKLMNOPQRSTUVWXYZ",25)
    println(sol)
}