import java.util.*

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
    val q = PriorityQueue<Int>()
    var list = mutableListOf<Int>()
    score.forEach {
        q.add(it)
        if (q.size > k) q.poll()
        list.add(q.peek())
    }
    return list.toIntArray()
    }
}