fun main() {
    var a = readln().toInt() > 0
    var b = readln().toInt() > 0
    if (a && b) print(1)
    else if(!a && b) print(2)
    else if(!a && !b) print(3)
    else if(a && !b) print(4)
}