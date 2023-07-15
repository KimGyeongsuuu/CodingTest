package programmers.lv1.내적

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        for (i in a.indices) {
            answer+=a[i] * b[i]
        }
        return answer
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2))
    println(sol)
}