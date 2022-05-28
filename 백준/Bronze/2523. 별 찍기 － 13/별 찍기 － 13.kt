fun main() {
    var a = readln().toInt()
    for(i in 1..a) println("*".repeat(i))
    for(i in a-1 downTo 1) println("*".repeat(i))
}