package programmers.크기가작은부분문자열

class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var str = ""
        var count = 0
        var intArr = mutableListOf<String>()

        for (i in t.indices) {
            str = ""
            if (i + p.length-1 < t.length-1) {
                for (j in i until p.length) {
                    str+=t[j]
                }
                intArr.add(str)
            }
        }

        for (i in intArr) {
            if (i.toInt() <= p.toInt()) {
                answer++
            }
        }
        return answer
    }
}

fun main() {
    val s = Solution()
    val sol = s.solution("3141592","271")
}