fun main() {
    while (true) {
        val (N, M) = readln().split(" ").map { it.toInt() }
        if (N == 0 && M == 0) {
            break
        }
        val arr1 = mutableListOf<Int>()
        val arr2 = mutableListOf<Int>()
        repeat(N) { arr1.add(readln().toInt()) }
        repeat(M) { arr2.add(readln().toInt()) }

        var cnt = 0
        arr2.forEach { cnt += cal(arr1, it) }
        println(cnt)
    }
}    
fun cal(arr1:List<Int>, findNum:Int) : Int {
    var first = 0
    var last = arr1.size-1
    var mid : Int
    while(first <= last) {
        mid = ( first+last ) / 2
        if(findNum==arr1[mid]) {
            return 1
        }
        else if(findNum < arr1[mid]) {
            last = mid-1
        }
        else {
            first = mid+1
        }
    }
    return 0
}
