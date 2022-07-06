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

// 다른 풀이 (이분 탐색)
// fun main() {
//     val N = readln().toInt()
//     val a = readln().split(" ").map { it.toInt() }.toMutableList()
//     val M = readln().toInt()
//     var b = readln().split(" ").map { it.toInt() }.toMutableList()
//     val buffer = StringBuffer()
//     a.sort()
//     for (num in b) {
//         val left = lowerBound(a, num)
//         val right = upperBound(a, num)
//         buffer.append(right - left).append(" ")
//     }
//     println(buffer.toString())
// }

// private fun lowerBound(arr: MutableList<Int>, num: Int): Int {
//     var L = 0
//     var R = arr.size - 1
//     while (L <= R) {
//         val mid = (L + R) / 2
//         if (arr[mid] < num) {
//             L = mid + 1
//         } else {
//             R = mid - 1
//         }
//     }
//     return L
// }

// private fun upperBound(arr: MutableList<Int>, num: Int): Int {
//     var L = 0
//     var R = arr.size - 1
//     while (L <= R) {
//         val mid = (L + R) / 2
//         if (arr[mid] <= num) {
//             L = mid + 1
//         } else {
//             R = mid - 1
//         }
//     }
//     return L
// }
