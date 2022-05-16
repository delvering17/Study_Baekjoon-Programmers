fun main() {
    var (a,b) = readln().split(" ").map { it.toInt() }
    var c = readln().toInt()
    if (b+c < 60) print("$a ${b+c}") else {
        a += (b+c)/60
        while(true) { if (a > 23) a -= 24 else break }
        b = (b+c)%60
        print("$a $b")
    }
}