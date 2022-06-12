import kotlin.math.pow

fun main() {
    var a = mutableListOf<Int>()
    for(i in 1..readln().toInt()) {
        a.add(cal(readln().split(" ").map { it.toInt() }))
    }
    a.forEach{println(it)}
}
fun cal(b: List<Int>):Int {
    var bmi = bmi(b)
    return when (b[0]) {
        in 1..140 -> 6
        in 141..145 -> 5
        in 146..158 -> 4
        in 159..160 -> {
            if(bmi >= 16.0 && bmi < 35.0 )  3
            else 4
        }
        in 161..203 -> {
            if(bmi >= 20.0 && bmi < 25.0) 1
            else if((bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0)) 2
            else if((bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0)) 3
            else 4
        }
        204 -> 4
        else -> {4}
    }
}
fun bmi(b: List<Int>) = b[1].toFloat()/(b[0]*0.01).pow(2).toFloat()