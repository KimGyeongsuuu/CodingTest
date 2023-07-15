package programmers.lv1.moneyCount

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for (i in 1 .. count) {
            answer += price * i
        }
        if (answer > money) answer-=money else answer = 0
        return answer
    }
}
fun main(){
    val s = Solution()
    val sol = s.solution(3,20,4)
    println(sol)
}