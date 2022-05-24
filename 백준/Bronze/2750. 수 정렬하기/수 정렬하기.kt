fun main() {
    var count = readln().toInt()
    var list = mutableListOf<Int>()
    for(i in 1..count)    list.add(readln().toInt())
    list.sort()
    for(i in list) println(i)
}
