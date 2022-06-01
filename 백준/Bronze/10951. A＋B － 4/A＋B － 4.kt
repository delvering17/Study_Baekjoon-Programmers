fun main() {
    while(true) {
        val (a, b) =(readlnOrNull() ?: break).split(" ").map { it.toInt() }
        println(a+b)
    }
}