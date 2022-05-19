fun main() {
    var go = mutableListOf<Int>()
    var con = mutableListOf<Int>()
    for (i in 1 until 10000) con.add(i)
    for(i in 1 until 10000) {
        var a : Int = 0
        when (i) {
            in 1..9 -> a = i + i
            in 10..99 -> a = i + (i/10) + (i%10)
            in 100..999 -> a = i + (i/100) + ((i/10)%10) + (i%10)
            in 1000..9999 -> a = i + (i/1000) + ((i/100)%10) + ((i/10)%10) + (i%10)
        }
        go.add(a)
    }
    con.removeAll(go)
    for(i in con.indices) println(con[i])
}