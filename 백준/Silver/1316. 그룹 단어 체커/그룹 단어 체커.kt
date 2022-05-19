fun main() {
    var num = readln().toInt()
    var count = num
    for(i in 1..num) {
        var a = readln().toCharArray()
        var b = mutableListOf<Char>()
        for (j in a.indices) {
            if (j == 0) {b.add(a[0]); continue}
            if (b.contains(a[j]) && a[j] != a[j-1]) {
                count--
                break
            }
            b.add(a[j])
        }
    }
    print(count)
}