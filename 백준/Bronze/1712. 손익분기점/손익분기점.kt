fun main() {
    var (a,b,c) = readln().split(" ").map { it.toInt() }
    print(if ((c-b)>0) (a/(c-b))+1 else -1)
}