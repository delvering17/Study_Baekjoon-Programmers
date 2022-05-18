fun main() {
    var arr = readln().toInt()
    var num = readln().split(" ").map { it.toInt() }.toMutableList()
    var list = mutableListOf<Int>()
    for(a in num) {
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
    print(num.size)
}