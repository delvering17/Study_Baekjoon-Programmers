fun main() {
    var num = readln().toInt()
    var a = 2
    while(num > 1) {
        if (num % a == 0) {
            num /= a
            println(a)
        }
        else a++
    }
}