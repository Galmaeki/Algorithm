class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.filterIndexed { i, _ -> i+1>=n }.toIntArray()
    }
}