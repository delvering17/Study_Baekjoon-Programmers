fun main() {
    readln()
    var a = readln().split(" ").map { it.toInt() }
    var b = readln().toInt()
    var cnt = 0
    a.forEach{if(it==b)cnt++}
    print(cnt)
}