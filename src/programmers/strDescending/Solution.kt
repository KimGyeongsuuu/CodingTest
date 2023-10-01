package programmers.strDescending

class Solution {

    fun solution(s: String): String {
        var arr = IntArray(s.length)
        var count = 0
        var answer = ""
        for (c in s) {
            arr[count] = c.toInt()
            count++
        }
        arr.sortDescending()
        for (i in arr) {
            answer+=i.toChar()
        }
        return answer
    }
}
fun main(){
    val s = Solution()
    println(s.solution("Zbcdefg"))
}