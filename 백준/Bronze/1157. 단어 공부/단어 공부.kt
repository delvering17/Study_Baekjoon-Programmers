fun main() {
    var str = readln().toString().toLowerCase().toCharArray()
    var arr = Array(26){'0'}
    var arrCC = Array(26){0}
    for (i in arr.indices) arr[i] = (97+i).toChar()
    for (i in str) if (arr.contains(i)) arrCC[arr.indexOf(i)]++
    var max = 0
    var which = 0
    for (i in arrCC) if(max < i) {
        max = i
        which = arrCC.indexOf(i)
    }
    arrCC[which] = -1
    if (arrCC.contains(max)) print('?')
    else print(arr[which].toUpperCase())
}