fun main() {
    var (a,b,c) = readln().split(" ").map { it.toInt() }
    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println((a%c)*(b%c)%c)
}