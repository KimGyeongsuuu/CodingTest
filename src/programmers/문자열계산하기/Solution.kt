package programmers.문자열계산하기

class Solution {
    fun solution(str: String): Int {
        var answer: Int = 0
        val num1 = str.substring(0, str.indexOf(" ")).toInt()
        val operator = str.substring(str.indexOf(" ")+1, str.indexOf(" ")+2)
        val num2 = str.substring(str.indexOf(" ") + 3).toInt()
        answer = if (operator == "+") {
            num1 + num2
        } else {
            num1 - num2
        }
        return answer
    }
}

fun main() {
    val s = Solution()
    println(s.solution("510 - 44"))
}