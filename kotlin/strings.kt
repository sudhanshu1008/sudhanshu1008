fun main(){
    println("enter string")
    var string = readln()
    println("Uppercase : ${string.toUpperCase()}")
    println("Lowercase : ${string.toLowerCase()}")
    println("Reverse : ${string.reversed().toUpperCase()}")
    println("Reverse : ${string.reversed().toLowerCase()}")
    var byte = string.encodeToByteArray()
    println("byte : $byte")
    val address = string.codePointBefore(4)
    println(address)
    val index = string[4]
    println(index)


}