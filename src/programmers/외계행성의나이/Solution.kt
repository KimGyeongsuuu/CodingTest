package programmers.외계행성의나이

class Solution {
    fun solution(age: Int): String {
        var inputAge = age
        var answer: String = ""
        var array = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j')
        while (inputAge / 10 != 0 || inputAge % 10 > 0) {
            val index = array.elementAt(inputAge % 10)
            inputAge /= 10
            answer += index
        }
        return answer.reversed()
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(51))
}