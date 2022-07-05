import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val cards = List<Int>(20000002) {0}.toMutableList()
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    br.readLine().split(" ").forEach { cards[it.toInt()+10000000]+= 1 }
    val m = br.readLine().toInt()
    br.readLine().split(" ").forEach { sb.append("${cards[it.toInt()+10000000]} ") }
    println(sb.toString())

}