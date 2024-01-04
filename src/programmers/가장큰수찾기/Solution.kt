package programmers.가장큰수찾기

class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = IntArray(2)
        for (i in array.indices) {
            if (answer[0] < array[i]) {
                answer[0] = array[i]
                answer[1] = i
            }
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(1,8,3))
    println(sol)
}