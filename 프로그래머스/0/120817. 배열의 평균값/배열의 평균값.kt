class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var s:Int=0
        numbers.forEach { n ->
            s+=n
        }
        answer = s/numbers.size.toDouble()
        return answer
    }
}