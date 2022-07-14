fun main() {
    var (a,b) = readln().split(" ").map { it.toBigInteger() }
    println("${a/b}\n${a%b}")
}