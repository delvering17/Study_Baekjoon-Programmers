fun main() {
    var a = 0
    var b = 1
    var count = readln().toInt()
    if(count > 1) count--
    while(true) {
        if(count == 0) {
            print(0)
            break
        }
        a += b
        count--
        if(count == 0) {
            print(a)
            break
        }
        b += a
        count--
        if(count == 0) {
            print(b)
            break
        }
    }
}