fun main() {
    var cnt = readln().toInt()
    var str = mutableListOf<String>()
    while(cnt-- >0) {
        var con = readln().toString().split(" ")
        var b = ""
        for(i in con[1].toCharArray()) repeat(con[0].toInt()) {b += i}
        str.add(b)
    }
    str.forEach{println(it)}
}