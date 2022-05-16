import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
fun main() {
    val a = BufferedReader(InputStreamReader(System.`in`))
    val b = StringTokenizer(a.readLine())
    val num1 = b.nextToken().toInt()
    val num2 = b.nextToken().toInt()
    println(num1+num2)
    println(num1-num2)
    println(num1*num2)
    println(num1/num2)
    println(num1%num2)
}