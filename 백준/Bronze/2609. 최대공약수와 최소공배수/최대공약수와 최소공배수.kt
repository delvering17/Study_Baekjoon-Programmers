fun main() {
    var (a,b) = readln().split(" ").map { it.toInt() }.sorted()
    var cnt = a;
    var res = 0;
    while(cnt > 0) {
        if(b%cnt == 0 && a%cnt == 0) {
            println(cnt)
            cnt=b
            break
        }
        cnt--
    }
    while(cnt > 0){
        if(cnt%b == 0 && cnt%a ==0) {
            println(cnt)
            break
        }
        cnt++
    }
}
