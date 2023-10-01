package programmers.phoneNum

class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var count = phone_number.length
        for (c in phone_number) {
            if (count != 4) {
                answer+="*"
                count--
            }
            else {
                answer+=c
            }
        }
        return answer
    }
}
fun main(){
    val s = Solution()
    val sol = s.solution("0233334444")
    println(sol)

}