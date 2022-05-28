fun main() {
    var a = readln().toInt()
    for(i in 1..a) println("*".repeat(i))
    for(i in a-1 downTo 1) println("*".repeat(i))
}

// for문 한 개

// fun main() {
//     var a = readln().toInt()
//     for(i in 1..a*2) if(i>a) println("*".repeat(2*a-i)) else println("*".repeat(i))
// }
