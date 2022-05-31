fun main() {
    var a = readln().toCharArray()
    var b = 0
    for(i in a) {
        when(i.toInt()) {
            in 65..67 ->  b += 3
            in 68..70 ->  b += 4
            in 71..73 ->  b += 5
            in 74..76 ->  b += 6
            in 77..79 ->  b += 7
            in 80..83 ->  b += 8
            in 84..86 ->  b += 9
            in 87..90 ->  b += 10
        }
    }
    print(b)
}