package programmers.intArray

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for (i in arr) {
            if (i % divisor == 0) {
                answer = answer.plus(i)
            }
        }
        if (answer.isEmpty()) {
            answer = answer.plus(-1)
        }
        answer.sort()
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(5,9,7,10),5)
    println(sol.contentToString())
}