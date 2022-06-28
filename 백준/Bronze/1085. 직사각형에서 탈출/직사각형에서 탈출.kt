fun main() {
    var input = readln().split(" ").map { it.toInt() }
    var arr = mutableListOf<Int>()
    arr.add(input[0])
    arr.add(input[1])
    arr.add(input[2]-input[0])
    arr.add(input[3]-input[1])
    println(arr.sorted()[0])
}