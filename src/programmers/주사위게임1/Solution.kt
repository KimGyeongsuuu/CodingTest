package programmers.주사위게임1

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if (a % 2 == 1 && b % 2 == 1) {
            answer = a * a + b * b
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b)
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = if (a > b) {
                a-b
            } else {
                b-a
            }
        }
        return answer
    }
}

fun main(){
    val s = Solution()
    println(s.solution(6,1))
}