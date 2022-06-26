fun main() {
    val sum = readln().toInt()
    var user = 0
    repeat(readln().toInt()){
        var (a,b) = readln().split(" ").map{ it.toInt()}
        user += (a*b)
    }
    if(sum==user) print("Yes") else print("No")
}
