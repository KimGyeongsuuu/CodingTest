package programmers.이진변환반복하기

import java.lang.Integer.*

class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(2)
        var str = s
        var count = 0
        var removeZero = 0
        while (str != "1") {
            val beforeStr = str
            str = str.replace("0", "")
            removeZero += beforeStr.length - str.length
            count++
            str = toBinaryString(str.length)
        }
        answer[0] = count
        answer[1] = removeZero
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution("110010101001")
    println(sol)
}