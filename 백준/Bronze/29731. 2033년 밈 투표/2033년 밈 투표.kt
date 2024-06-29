fun main() {
    var a = readln().toInt()
    var gong = listOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )
    for (i in 0 until  a){
        var a = readln()
        if(!gong.contains(a)){
            println("Yes")
            return
        }
    }
    println("No")
}