package programmers.추억점수

class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        var score: Int = 0
        var scoreArray = HashMap<String, Int>(name.size)
        for (s in name) {
            scoreArray[s] = yearning[name.indexOf(s)]
        }
        for (strings in photo) {
            for (string in strings) {
                if (scoreArray[string] != null){
                    score+= scoreArray[string]!!
                }
            }
            answer+=score
            score=0
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(
        arrayOf("may", "kein", "kain", "radi"),
        intArrayOf(5,10,1,3),
        arrayOf(
            arrayOf("may", "kein", "kain", "radi"),
            arrayOf("may", "kein", "dd", "aa"),
            arrayOf("kain", "may", "ad", "cd")
        )
    )
    println("---------------")
    println(sol)
}