fun main() {
    var str = readln().toString().toLowerCase().toCharArray()
    var arr = Array(26){'0'}
    var arrCC = Array(26){-1}
    for (i in arr.indices) arr[i] = (97+i).toChar()
    for (i in str.indices) if (arr.contains(str[i]) && arrCC[arr.indexOf(str[i])] == -1)  arrCC[arr.indexOf(str[i])] = i
    for(i in arrCC) print("$i ")
}
