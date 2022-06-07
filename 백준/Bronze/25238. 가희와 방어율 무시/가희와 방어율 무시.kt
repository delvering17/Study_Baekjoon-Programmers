fun main() {
    var (a,b) = readln().split(" ").map { it.toFloat() }
    print(if(a-((a/100)*b) >=100) 0 else 1 )
}