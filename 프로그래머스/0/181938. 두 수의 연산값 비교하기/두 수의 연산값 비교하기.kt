class Solution {
    fun solution(a: Int, b: Int): Int {
        val c = (a.toString() + b.toString()).toInt()
        return if(c>=2*a*b) c else 2*a*b
    }
}