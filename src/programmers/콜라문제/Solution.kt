package programmers.콜라문제

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 1
        var cola = n
        var plusCola = 0
        var empty = 0
        var result = 0
        while (cola >= a) {
            if (cola % a > 0) {
                plusCola+=cola%a
            }
            answer = (cola / a) * b
            cola = answer + plusCola
            plusCola=0
            empty+=plusCola
            result+=answer
        }
        answer += (empty / a)
        return result
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(2,1,20)
    println(sol)
}