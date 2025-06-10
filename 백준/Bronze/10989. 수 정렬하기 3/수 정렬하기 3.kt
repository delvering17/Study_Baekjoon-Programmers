import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var arr = IntArray(10001)
    for (i in 0 until br.readLine().toInt())    arr[br.readLine().toInt()]++
    br.close()
    for (i in arr.indices) bw.write("$i\n".repeat(arr[i]))
    bw.close()
}
