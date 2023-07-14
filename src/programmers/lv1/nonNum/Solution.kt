package programmers.lv1.nonNum

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        for (i in 0 .. 9) {
            if (!numbers.contains(i)) answer+=i
        }
        return answer
    }
}
fun main(){
    val s = Solution()
    val sol = s.solution(intArrayOf(5,8,4,0,6,7,9))
    println(sol)
}