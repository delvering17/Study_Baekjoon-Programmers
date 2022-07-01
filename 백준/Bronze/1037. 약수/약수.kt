fun main() {
    val cnt = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    print(arr.maxOf { it } * arr.minOf { it })
}