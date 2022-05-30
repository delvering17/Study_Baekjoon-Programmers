fun main() {
    var a = readln().toString().trim().split(" ").toMutableList()
    a.remove("")
    print(a.size)
}