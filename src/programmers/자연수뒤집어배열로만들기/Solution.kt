package programmers.자연수뒤집어배열로만들기

class Solution {
    fun solution(n: Long): IntArray {
        var answer: IntArray = intArrayOf()
        for (c in n.toString().toCharArray().reversed()) {
            answer+=c.toString().toInt()
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(12345)
    println("---------------------------")
    for (i in sol) {
        println(i)
    }
    println(sol)
}