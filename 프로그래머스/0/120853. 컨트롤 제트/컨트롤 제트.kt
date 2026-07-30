import java.util.*

class Solution {
    fun solution(s: String): Int {
        var st = Stack<Int>()
        s.split(" ").forEach{
            if(!it.equals("Z")) st.add(it.toInt())
            else st.pop()
        }
        return st.sum()
    }
}