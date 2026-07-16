import java.util.*

class Solution {
fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0
    val st = Stack<Int>()
    moves.forEach{
        for (i in 0 until board.size){
            val n = it-1
            if(board[i][n] == 0) continue
            else {
                val a : Int = board[i][n]
                if(st.isNotEmpty()&&st.peek() == a) {
                    st.pop()
                    answer+=2
                }
                else st.add(a)
                board[i][n] = 0
                break
            }
        }
    }
    return answer
}
}