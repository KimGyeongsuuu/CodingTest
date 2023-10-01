package programmers.하샤드수

class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        val result = x.toString().map {
            it.toInt() - '0'.toInt()
        }.sum()
        if (x % result != 0) answer = false
        return answer
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution(12)
    println(sol)
}