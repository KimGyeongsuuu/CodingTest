package programmers.크기가작은부분문자열

class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var str: String = ""
        for(i in 0..t.length-p.length) {
            str=t.substring(i, i+p.length)
           if ( str.toLong() <= p.toLong()) answer++
        }
        return answer
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution("3141592","271")
    println(sol)
}