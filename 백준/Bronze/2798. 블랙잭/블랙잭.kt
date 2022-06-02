fun main() {
    var (cnt,num) = readln().split(" ").map { it.toInt() }
    var a = readln().split(" ").map { it.toInt() }
    var max = 0
    for(i in a.indices) {
        for(j in i+1 until a.size) {
            for(k in j+1 until a.size) {
                var n = a[i]+a[j]+a[k]
                if(n in (max + 1)..num) max = n
            }
        }
    }
    print(max)
}