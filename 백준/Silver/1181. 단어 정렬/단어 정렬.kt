fun main() {
    var set = mutableSetOf<String>()
    repeat(readln().toInt()) { set.add(readln().toString()) }
    var list = set.sortedWith(Comparator<String>() { a,b ->
        if(a.length > b.length) 1
        else if (a.length < b.length) -1
        else a.compareTo(b)
    })
    list.forEach { println(it) }
//    list.distinct()
//        .sortedWith( compareBy<String> { it.length }.thenBy {it})
//        .forEach { println(it) }
}