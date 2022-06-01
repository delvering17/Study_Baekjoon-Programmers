fun main() {
    var a = readln().split(" ").map { it.toInt() }
    if(a[0] == a[1] && a[1] == a[2]) print(10000+(a[0]*1000))
    else if(a[0] == a[1]) print(1000+(a[0]*100))
    else if(a[2] == a[1]) print(1000+(a[1]*100))
    else if(a[0] == a[2]) print(1000+(a[0]*100))
    else print(a.maxOf {it*100})
}