import java.math.BigInteger
fun main() {
    var N :BigInteger = readln().toBigInteger()
    println(cal(N))
}
fun cal(findNum:BigInteger) : BigInteger {
    var first:BigInteger = (0).toBigInteger()
    var last:BigInteger = findNum
    var mid : BigInteger
    while(first <= last) {
        mid = ( first+last ) / (2).toBigInteger()
        mid*mid
        if(mid*mid==findNum) {
            return mid
        }
        else if(mid*mid> findNum) {
            last = mid- (1).toBigInteger()
        }
        else {
             first = mid+(1).toBigInteger()
        }
    }
    return (0).toBigInteger()
}
