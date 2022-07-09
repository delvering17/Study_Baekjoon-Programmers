fun main() {

    val (N, M) = readln().split(" ").map { it.toInt() }
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()
    repeat(N) { arr1.add(readln().toInt()) }
    repeat(M) { arr2.add(readln().toInt()) }
    arr1.sort()
    arr2.forEach { println(cal(arr1, it)) }
}
fun cal(arr1:List<Int>, findNum:Int) : Int {
    var first = 0
    var last = arr1.size-1
    var mid : Int = -1
    var cnt = -1
    while(first <= last) {
        mid = ( first+last ) / 2
        if(findNum==arr1[mid]) {
            cnt = mid
            last = mid -1
        }
        else if(findNum < arr1[mid]) {
            last = mid-1
        }
        else {
             first = mid+1
        }
    }
    return cnt
}