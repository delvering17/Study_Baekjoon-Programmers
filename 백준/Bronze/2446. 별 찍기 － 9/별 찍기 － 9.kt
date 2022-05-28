fun main() {
    var a = readln().toInt()
    for(i in 1..a) println(" ".repeat(i-1) + "*".repeat(2*a-(2*i-1)))
    for(i in 1 until a) println(" ".repeat(a-i-1) + "*".repeat(2*i+1) )
}