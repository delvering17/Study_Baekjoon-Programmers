fun main() {
    var count = readln().toInt()
    var num = readln().split(" ").map { it.toInt() }
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    for(i in num) {
        if(max<i) max = i
        if(min>i) min = i
    }
    print("$min $max")
}