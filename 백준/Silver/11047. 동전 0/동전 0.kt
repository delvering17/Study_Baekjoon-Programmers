fun main() {
    var (N,K) = readln().split(" ").map { it.toInt() }
    var arr = mutableListOf<Int>()
    repeat(N) {
        arr.add(readln().toInt())
    }
    var coin = K
    var cnt = 0
    while(true) {
//        println ("$coin - ${cal(arr,coin)}")
        if(coin-cal(arr,coin) < 0) {
           break
        }
        else {
            cnt++
            coin -= cal(arr,coin)

        }
    }
    println(cnt)
}
fun cal(arr : List<Int>, num : Int) : Int {
    var low = 0
    var high = arr.size-1
    var mid : Int
    var coin : Int = 0
    while(low <= high) {
        mid = (low + high) / 2
        if(num == arr[mid]) {
            return arr[mid]
        }
        else if(num > arr[mid]) {
            low = mid+1
        }
        else if(num < arr[mid]){
            high = mid - 1
        }
    }
    if(low == 0) {
        return arr[low]
    }
    else {
        return arr[low-1]
    }

}