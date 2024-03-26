fun main(){
    var school = readln()
    var a : String = when(school){
        "BHA" -> "Branksome Hall Asia"
        "KIS" -> "Korea International School"
        "SJA" -> "St. Johnsbury Academy"
        else -> "North London Collegiate School"
    }
    
    println(a)
}