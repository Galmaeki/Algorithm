fun main(){
    var a = readln()
    var b = when(a){
        "M"-> "MatKor"
        "W"->"WiCys"
        "C"->"CyKor"
        "A"->"AlKor"
        else ->"\$clear"
    }
    println(b)
}