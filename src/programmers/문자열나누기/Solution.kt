package programmers.문자열나누기

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var sameChar = 0
        var differChar = 0
        var array = ""
        var index = 0
        var str = s
        for (c in s) {
            if (str[index]==c) {
                sameChar++
            } else {
                differChar++
            }
            if (sameChar == differChar) {
                val substring = str.substring(index, index + sameChar + differChar)
                array+= "$substring "
                index += sameChar + differChar
                sameChar=0
                differChar=0
            }
        }
        if (sameChar > 0) {
            val substring = str.substring(index, index + sameChar)
            array+= "$substring "
        }
        answer = array.split(" ").size-1
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution("abracadabra")
    println(sol)
}