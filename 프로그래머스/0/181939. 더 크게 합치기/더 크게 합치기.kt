class Solution {
fun solution(a: Int, b: Int): Int {
    var aa = (a.toString() + b.toString()).toInt()
    var bb = (b.toString() + a.toString()).toInt()
    return if(aa>bb) aa else bb
}
}