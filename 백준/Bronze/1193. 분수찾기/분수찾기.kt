fun main() {
    var num = readln().toInt()
    var count = 1
    while(true) {
        if(num - count <= 0) break
        num -= count
        count++
    }
    if (count%2 == 0) print("$num/${count+1-num}")
    else print("${count+1-num}/$num")
}