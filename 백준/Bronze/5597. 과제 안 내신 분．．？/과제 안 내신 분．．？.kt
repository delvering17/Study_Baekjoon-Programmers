fun main() {
    var arr = mutableListOf<Int>()
    repeat(28) { arr.add(readln().toInt()) }
    val arr2 = List<Int>(30) { i -> i+1 }.toMutableList().also {
        it.removeAll(arr)
        it.sort()
        it.forEach { a ->
            println(a.toInt())
        }
    }
}