import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
fun main() {
    val a = BufferedReader(InputStreamReader(System.`in`))
    val b = StringTokenizer(a.readLine())
    print(b.nextToken().toInt()+b.nextToken().toInt())
}