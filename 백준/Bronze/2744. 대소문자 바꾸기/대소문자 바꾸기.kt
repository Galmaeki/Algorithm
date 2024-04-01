fun main(){
    val str = readln().toCharArray()

    for (c in str) {
        if(c.isLowerCase())
            print(c.uppercase())
        else
            print(c.lowercase())
    }
}