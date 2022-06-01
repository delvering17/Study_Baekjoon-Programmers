fun main() {
    val (a,b) =readln().split(" ").map {it.toInt()}
    print(a*b)
}

// short coding

// it의 index를 가져오면 type은 char이므로 it.toInt()는 아스키 값을 가져온다.
// '0'를 빼줘서 계산하면 끝
// fun main()= print(readln().let{ (it[0]-'0')*(it[2]-'0')})
