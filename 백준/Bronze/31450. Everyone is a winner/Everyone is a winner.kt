fun main(){
    var a = readln().split(" ")
    println(if(a[0].toInt() % a[1].toInt() ==0) "Yes" else "No" )
}