fun main() {
    var arr = List(9){ readln().toInt()}
    var num = 0
    var max = 0
    for (i in 1..arr.size) if(max < arr[i-1]) max = arr[i-1]
    for (i in 1..arr.size) if(max == arr[i-1]) num=i
    println("$max\n$num")
}
