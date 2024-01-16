package programmers.카드뭉치

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        var cards1Count = 0
        var cards2Count = 0
        for (i in goal.indices) {
            if (goal[i] == cards1[cards1Count]) {
                if (cards1Count != cards1.size-1) {
                    cards1Count++
                }
            } else if (goal[i] == cards2[cards2Count]) {
                if (cards2Count != cards2.size-1) {
                    cards2Count++
                }
            } else {
                return "NO"
            }
        }
        return "Yes"
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(
        arrayOf("drink", "water"),
        arrayOf("want", "to"),
        arrayOf("want", "drink", "to", "to")
    )
    println(sol)
}