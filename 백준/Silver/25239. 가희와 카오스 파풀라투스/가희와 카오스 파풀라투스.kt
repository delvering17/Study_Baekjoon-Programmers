fun main() {

    var one = readln().split(":").map { it.toInt() }.toMutableList()
    var two = readln().split(" ").map { it.toInt() }.toMutableList()
    var three = readln().toInt()
    var cnt = con(one[0])
    for(i in 1..three) {
        var user = readln().split(" ").map { it.toString() }

        if(user[1].contains("^")) {
            two[cnt-1] = 0

        }
        else if(user[1].contains("HOUR")) {
            one[0] += (user[1][0]-'0')
            if(one[0]>=12) one[0] -= 12
            cnt = con(one[0])
        }
        else {
            one[1] += (user[1][0]-'0')*10
            if(one[1] >= 60) {
                one[1] -= 60
                one[0] += 1
                if(one[0]>=12) one[0] -= 12
            }
            cnt = con(one[0])
        }
    }
    print(if(two.sum()>=100) 100 else two.sum())
}
fun con(a :Int):Int = when(a) {
    0,1-> 1
    2,3 -> 2
    4,5 -> 3
    6,7 -> 4
    8,9 -> 5
    10,11 -> 6
    else -> 1
}