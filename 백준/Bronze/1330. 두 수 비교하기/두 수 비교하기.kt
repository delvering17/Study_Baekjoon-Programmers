fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var res = ""
    if (a>b) print(">")
    else if(b>a) print("<")
    else print("==")
}