fun main() {
    var arr = Array(10){0}
    for (i in arr.indices) arr[i] = readln().toInt()
    var div = Array(42){0}
    for (i in arr.indices) div[arr[i]%42]++
    var count = 0
    for (i in div.indices) if( div[i]>0) count++
    print(count)
}