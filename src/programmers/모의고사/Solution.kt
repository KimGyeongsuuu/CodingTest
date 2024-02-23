package programmers.모의고사

import java.util.Collections

class Solution {
    fun solution(answers: IntArray): IntArray {
        var rank = HashMap<Int,Int>()
        var count = 0

        var people = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        for (person in people) {
            var score = 0
            for (i in answers.indices) {
                if (answers[i] == person[i % person.size]) {
                    score++
                }
            }
            rank[count++] = score
        }

        val answer = rank.entries
            .groupBy({ it.value }, { it.key })
            .maxByOrNull { it.key }
            ?.value.orEmpty()
            .sorted()
            .map { it + 1 }

        return answer.toIntArray()
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(intArrayOf(3,3,2,1,5))
    println(sol)
}