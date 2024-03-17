fun main(){
    var count = readln().toInt()
    for(i in 0 until count){
        var a = readln()
        println(if(a.length in 6..9) "yes" else "no")
    }
}