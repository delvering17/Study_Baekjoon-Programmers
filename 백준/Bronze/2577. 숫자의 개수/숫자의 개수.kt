fun main() {
    var arr = List(3){ readln().toInt()}
    var numArr = Array(10){0}
    var num = 1
    for(i in arr) num *= i
    while(num != 0){
        numArr[num%10]++
        num /= 10
    }
    for(i in numArr) println("$i")
}