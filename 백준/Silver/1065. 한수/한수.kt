fun main() {
    var num = readln().toInt()
    var count = 0
    for (i in 1..num) {
        when(i) {
            in 1..99 -> count++
            in 100..999 -> {
                var one = i/100
                var two = (i/10)%10
                var three = i%10
                if( (one-two) == (two-three)) count++
            }
        }
    }
    print(count)
}