package programmers.명예의전당1

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var list = mutableListOf<Int>()
        for(sc in score){
            if(list.size < k) list += sc
            else if(list[0] < sc) list[0] = sc

            list.sort()
            answer += list[0]
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200))
    println(sol)
}