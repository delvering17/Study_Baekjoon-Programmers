fun main() {
    var (a,b,c) = readln().split(" ").map { it.toInt() }
    var cnt = 0;
    if(b >= c) print(-1)
    else {
        while(a >= 0){
            cnt++
            a -= (c-b)
        }
        print(cnt)
    }
}