class Solution {
fun solution(arr: IntArray): IntArray {
    var list = mutableListOf<Int>()
    arr.forEach { for (i in 0 until it) list.add(it)
    }
    return list.toIntArray()
}
}