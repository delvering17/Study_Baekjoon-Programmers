import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.ceil
fun main() {
    var (a,b,c) = BufferedReader(InputStreamReader(System.`in`)).readLine().split(" ").map { it.toDouble() }
    var count :Double= (c-a)/(a-b)
    print(ceil(count).toInt()+1)
}