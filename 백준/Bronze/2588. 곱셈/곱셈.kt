fun main() {
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num = num2
    for(i in 1..3) {
        println(num1*(num2%10))
        num2 /= 10
    }
    println(num1*num)
}