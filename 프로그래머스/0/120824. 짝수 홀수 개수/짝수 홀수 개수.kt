class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        num_list.forEach{
            if(it%2==1) answer[1]++
            else answer[0]++
        }
        return answer
    }
}