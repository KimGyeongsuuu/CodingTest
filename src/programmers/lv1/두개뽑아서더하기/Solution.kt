package programmers.lv1.두개뽑아서더하기

class Solution {
    fun solution(numbers: IntArray): List<Int> {
        val answer: MutableList<Int> = mutableListOf()
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                if (!answer.contains(numbers[i] + numbers[j])) {
                    answer.add(numbers[i] + numbers[j])
                }
            }
        }
        return answer.sorted()
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(2,1,3,4,1))
    println(sol)
}