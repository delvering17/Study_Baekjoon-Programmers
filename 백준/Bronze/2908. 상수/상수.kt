fun main() {
    var (a,b) = readln().split(" ").map { it.toString().reversed().toInt()}
    if(a>b) print(a) else print(b)
}