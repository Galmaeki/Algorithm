class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
    var answer = mutableListOf<Int>()
    var tn = 0
    for (i in 0 until num_list.size) {
        if(tn % n == 0) {
            answer.add(num_list[i])
            tn++
        }else tn++

    }
    return answer.toIntArray()
    }
}