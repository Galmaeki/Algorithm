class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        
        if(b>a) for (i in b downTo a) answer+=i
        else for (i in a downTo b) answer+=i
        return answer
    }
}