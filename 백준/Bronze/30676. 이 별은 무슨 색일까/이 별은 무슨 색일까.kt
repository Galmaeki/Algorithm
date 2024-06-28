fun main() {
    var a = readln().toInt()
    var b = when (a) {
        in 380 until 425 -> "Violet"
        in 425 until 450 -> "Indigo"
        in 450 until  495 -> "Blue"
        in 495 until 570 -> "Green"
        in 570 until 590 -> "Yellow"
        in 590 until 620 -> "Orange"
        else -> "Red"
    }
    println(b)
}