fun main() {
    var (a,b) = readln().split(" ").map { it.toInt() }
    if(a== 0 && b < 45) print("23 ${b+15}")
    else if(b < 45) print("${a-1} ${b+15}")
    else print("$a ${b-45}")
}