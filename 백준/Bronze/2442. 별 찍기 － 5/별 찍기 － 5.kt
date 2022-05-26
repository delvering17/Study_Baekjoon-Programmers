fun main() {
    var a = readln().toInt()
    println(" ".repeat(a-1) + "*") ;
    for (i in 1 until a)   println(" ".repeat(a-i-1) + "*".repeat(i) +"*"+"*".repeat(i))
}
