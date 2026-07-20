class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
    var list = mutableListOf<Int>()
    arr.forEach{
        if(!delete_list.contains(it)) list.add(it)
    }
    return list.toIntArray()
    }
}