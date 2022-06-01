fun main() {
    while (true) {
        var (a, b) = readln().split(" ").map { it.toInt() }
        if (a == 0 && b == 0) break
        else println(a + b)
    }
}