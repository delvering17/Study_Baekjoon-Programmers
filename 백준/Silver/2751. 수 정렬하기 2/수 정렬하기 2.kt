fun main()= run{
    val a = StringBuffer()
    Array(readln().toInt()){ readln().toInt()}.sorted().forEach { a.append("$it\n") }
    print(a)
}