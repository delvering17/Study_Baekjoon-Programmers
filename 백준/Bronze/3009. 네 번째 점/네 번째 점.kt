fun main() {
    var arr1 = mutableListOf<Int>()
    var arr2 = mutableListOf<Int>()
    repeat(3) {
        readln().split(" ").map { it.toInt() }.let {(a,b) ->
            if(!arr1.contains(a)) {arr1.add(a)}
            else {arr1.remove(a)}
            if(!arr2.contains(b)) {arr2.add(b)}
            else {arr2.remove(b)}
        }
    }
    print("${arr1[0]} ${arr2[0]}")
}