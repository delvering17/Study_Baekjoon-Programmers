fun main() {
    var a = readln().toInt()
    for (i in a-1 downTo  1) println(" ".repeat((a-1)-i)+"*".repeat(i)+"*"+"*".repeat(i))
    println(" ".repeat(a-1)+"*")
}