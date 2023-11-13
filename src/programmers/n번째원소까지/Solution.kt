package programmers.n번째원소까지

class Solution {
    fun solution(array: IntArray, n: Int): IntArray {
        var answer = IntArray(n)
        for(i in 0 until n) {
            answer[i] = array[i]
        }
        return answer
    }
}
fun main(){
    val s = Solution()
    val sol = s.solution(intArrayOf(5,2,1,7,5),3)
    for (i in sol) {
        println(i)
    }
}