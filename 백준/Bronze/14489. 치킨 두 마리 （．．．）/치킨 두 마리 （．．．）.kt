
fun main() {
    val fl = readln().split(" ").map { it.toInt() }
    val chicken = readln().toInt()

    var money =  fl[0]+fl[1]

    if(money>=chicken*2){
        println(money-(chicken*2))
    }else{
        println(money)
    }
}