fun main() {
    var num = readln().toInt()
    var count = Array(10){0}
    while(num != 0) {
        if (num%10 == 9) count[6]++
        else count[num%10]++
        num /= 10
    }
    if (count[6]/2!=0) count[6]++
    count[6]/=2
    var max = 1
    for (i in count.indices) if(max < count[i]) max = count[i]
    print(max)
}