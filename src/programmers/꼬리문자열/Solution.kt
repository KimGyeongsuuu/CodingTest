package programmers.꼬리문자열

class Solution {
    fun solution(list: Array<String>, ex: String): String {
        var answer: String = ""
        list.map {
            if (!it.contains(ex)) answer+=it
        }
        return answer
    }
}
fun main() {
    val sol = Solution()
    val s = sol.solution(arrayOf("abc", "bbc", "cbc"), "c")
    println(s)
}