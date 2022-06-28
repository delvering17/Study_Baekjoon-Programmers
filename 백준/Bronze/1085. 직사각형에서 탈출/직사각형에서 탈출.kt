fun main() {
    var input = readln().split(" ").map { it.toInt() }
    print(listOf(input[0],input[1],input[2]-input[0],input[3]-input[1]).sorted()[0])
}