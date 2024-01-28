package programmers.가장가까운같은글자

class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(s.length)
        var isExist = false
        answer[0] = -1
        for (i in 1 until s.length) {
            for (j in 0 until i) {
                if (s[i]==s[j]) {
                    answer[i]=i-j
                    isExist=true
                } else {
                    if (!isExist) {
                        answer[i]=-1
                    }
                }
            }
            isExist = false
        }
        for (i in answer) {
            println(i)
        }

        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution("banana")
}