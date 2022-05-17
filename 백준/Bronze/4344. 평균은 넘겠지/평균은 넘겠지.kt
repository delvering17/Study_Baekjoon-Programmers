fun main() {
    var a = readln().toInt()
    var arr = Array(a){0.0}
    var avg = Array(a){0.0}
    for (i in arr.indices) {
        var b = readln().split(" ").map { it.toDouble() }
        for (j in 1 until b.size) arr[i] += b[j]
        arr[i] /= b[0]
        var count = 0.0
        for (j in 1 until b.size) if (b[j] > arr[i]) count++
        avg[i] =(count*100)/b[0]
    }
    for (i in avg.indices) println(String.format("%.3f",avg[i])+'%')
}