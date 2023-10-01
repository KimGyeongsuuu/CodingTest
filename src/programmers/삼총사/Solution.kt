package programmers.삼총사

class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0

        for (i in number.indices) {
            for (j in i+1 until number.size) {
                for (k in j+1 until number.size) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++
                    }
                }
            }
        }
        return answer
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(-2,3,0,2,-5))
    println(sol)

}