import java.util.*
fun main() = with(Scanner(System.`in`)){
    val cnt = readln().toInt()
    val list = arrayListOf<Pair<Int,String>>()
    for(i in 1..cnt) {list.add(Pair(nextInt(),nextLine()))}

    var sortList = list.sortedWith(compareBy { it.first })
    for(i in 0 until cnt) {println("${sortList[i].first}${sortList[i].second}") }
}
