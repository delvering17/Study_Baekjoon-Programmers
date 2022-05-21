fun main() {
    var count = 0
    while(true ) {
        var num = readln().toInt()
        if(num == 0 ) break
        for (i in num+1..2 * num) if (isPrime(i) && i != 1) count++
        println(count)
        count = 0
    }
}
fun isPrime(num : Int) : Boolean{
    var i = 2
    while(i * i <= num) {
        if(num % i++ == 0) {
            return false
        }
    }
    return true
}