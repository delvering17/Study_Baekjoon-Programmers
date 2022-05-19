fun main() {
    var num = readln().toInt()
    var a = 0
    if(num%5 == 0 ) a = num/5
    else if ((num%5)%3 == 0) a = (num/5)+(num%5)/3
    else if (num%3 == 0) a = num/3
    else a = -1
    for(i in (num/5) downTo 1) {
        if((num-(i*5))%3 == 0) {
            a = i+(num-(i*5))/3
            break
        }
    }
    print(a)
}