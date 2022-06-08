fun main() {
    var num = readln().toInt()
    for(i in num-num.toString().length*9..num) {
        if(i+con(i)==num) {
            print(i)
            return
        }
    }
    print(0)
}
fun con(a : Int) : Int {
    var cc = 0
    for(a in a.toString()) cc += a-'0'
    return cc
}