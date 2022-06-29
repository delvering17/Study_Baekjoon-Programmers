fun main() {
    var arr = mutableListOf<Pair<Int,Int>>()
    repeat(readln().toInt()) { arr.add(readln().split(" ").map {it.toInt() }.let { Pair(it[0],it[1]) }) }

    arr.sortWith(
        compareBy<Pair<Int, Int>> { it.first }
            .thenBy { it.second }
    )
    arr.forEach {
        println("${it.first} ${it.second}")
    }
}