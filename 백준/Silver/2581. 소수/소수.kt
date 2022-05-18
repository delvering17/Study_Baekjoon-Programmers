fun main() {
    var start = readln().toInt()
    var end = readln().toInt()
    var list = mutableListOf<Int>()
    var num = mutableListOf<Int>()
    for(a in start..end) {
        num.add(a)
        if (a == 2 ) continue
        if (a == 1 ) {
            list.add(1)
            continue
        }
        for (i in 2 until a) {
            if (a % i == 0) {
                list.add(a)
                break
            }
        }
    }
    num.removeAll(list)
    if (num.size == 0)  print(-1)
    else {
        num.sort()
        println(num.sum())
        println(num[0]) 
    }
}