package programmers.K번째수

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        var arrList = ArrayList<Int>(commands.size)
        var count = 0
        for (command in commands) {
            for (i in command[0]-1 until command[1]) {
                arrList.add(array[i])
            }
            arrList.sort()
            answer[count++]=arrList[command[2]-1]
            arrList.clear()
        }
        return answer
    }
}
fun main() {
    val s = Solution()
    val sol = s.solution(
        intArrayOf(1,5,2,6,3,7,4),
        arrayOf(
            intArrayOf(2,5,3),
            intArrayOf(4,4,1),
            intArrayOf(1,7,3)
        )
    )
    println(sol)
}