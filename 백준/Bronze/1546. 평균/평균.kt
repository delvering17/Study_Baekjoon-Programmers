fun main() {
    var cc = readln().toDouble()
    var sum = readln().split(" ").map{ it.toDouble() }.toMutableList()
    var max = 0.0
    for (i in sum.indices) if (max < sum[i]) max = sum[i]
    for (i in sum.indices) sum[i] = (sum[i]/max*100)
    println(sum.sum()/cc)
}