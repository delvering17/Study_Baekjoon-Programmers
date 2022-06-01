fun main() {
    var (cnt,num) = readln().split(" ").map { it.toInt() }
    var a = readln().split(" ").map { it.toInt() }
    a.forEach(){if(it<num)print("$it ")}
}