fun main() {
    var count = 0
    var num = readln().toInt() 
    var num11 = num
    var num1 = 0
    var num2 = 0
    while(true){
        num1 = num11/10
        num2 = num11%10
        num11 = (num2*10+((num1+num2)%10))
        count++
        if(num11 ==num) break;
    }
    print(count)
}
