fun main() {
    val N = readln().toInt()
    val arr1 = readln().split(" ").map { it.toInt() }.sorted()
    val M = readln().toInt()
    val arr2 = readln().split(" ").map { it.toInt() }
    arr2.forEach { println("${cal(arr1,it)} ") }
}
fun cal(arr1: List<Int>, findNum: Int) : Int {
    var low = 0
    var high = arr1.size-1
    var mid: Int;
    while(low <= high) {
        mid = (low + high) / 2
        if(findNum == arr1[mid]) { return  1 }
        else if(findNum < arr1[mid]) { high = mid - 1 }
        else low = mid + 1
    }
    return 0
}