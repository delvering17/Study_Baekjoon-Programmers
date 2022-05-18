fun main() {
    var num = readln().toInt()
    var count : Int
    var arr = mutableListOf<Int>()
    var jum : Int
    for (i in 1..num) {
        jum = 0
        count = 0
        var str = readln().toCharArray()
        for(j in str) {
            count++
            if(j == 'X') count = 0
            jum += count
        }
        arr.add(jum)
    }
    for (i in arr) println(i)
}