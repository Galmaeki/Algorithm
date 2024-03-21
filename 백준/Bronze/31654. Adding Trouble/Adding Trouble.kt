import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var arr = br.readLine().split(" ")

    var a = arr[0].toInt()
    var b = arr[1].toInt()
    var c = arr[2].toInt()

    println(if (a + b == c) "correct!" else "wrong!")
}