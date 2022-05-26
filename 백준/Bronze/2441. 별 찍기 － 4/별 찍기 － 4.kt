fun main() {
    var a = readln().toInt()
    for(i in a downTo 0) println(" ".repeat(a-i)+"*".repeat(i))
}