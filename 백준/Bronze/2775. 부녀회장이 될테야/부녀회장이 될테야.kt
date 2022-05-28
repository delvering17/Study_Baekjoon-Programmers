fun main() {
    var a = ""
    for (i in 1..readln().toInt()) a+= room(readln().toInt(),readln().toInt()).toString() + "\n"
    print(a)
}
fun room(k: Int, n: Int) : Int {
    var people = 0
    if(k == 0) for (i in n downTo 1) people += i
    else if (k==1) people += room(k-1,n)
    else  for(i in n downTo 1) people += room(k-1,i) // 3, 1
    return people
}