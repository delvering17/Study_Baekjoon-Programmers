fun main() {
    var num = readln().toInt()
    var res = 1
    for(i in 1..num) res *= i
    print(res)
}