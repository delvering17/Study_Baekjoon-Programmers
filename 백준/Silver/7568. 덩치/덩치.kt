fun main() {
    var arr = Array(readln().toInt()) { readln().split(" ").map { it.toInt() } }
    for(arr1 in arr) {
        var point = 1
        for(arr2 in arr) { if(arr1[0] < arr2 [0] && arr1[1] < arr2[1]) { point++ } }
        println(point)
    }
}