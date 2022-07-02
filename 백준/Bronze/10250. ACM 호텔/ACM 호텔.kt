fun main() {
    var cnt = readln().toInt()
    var res = StringBuffer()
    repeat(cnt) {
        var arr = readln().split(" ").map { it.toInt() }
        if((arr[2]%arr[0])==0) {
            var W = arr[0]*100
            var H = arr[2]/arr[0]
            res.append("${W+H}\n")
        }
        else {
            var W = (arr[2]%arr[0])*100
            var H = (arr[2]/arr[0])+1
            res.append("${W+H}\n")
        }
    }
    println(res.toString())
}