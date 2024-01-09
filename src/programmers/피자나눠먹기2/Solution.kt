package programmers.피자나눠먹기2

class Solution {
    fun solution(n: Int): Int {
        var count = 1
        while (count * 6 % n != 0) count++
        return count
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(10)
    println(sol)
}