fun main() {
    for(i in 1..readln().toInt()) {
        repeat(i) { print('*') }
        println()
    }
}

// 조금 더 짧은  코딩 
// fun main() {
//    for(n in 1..readln().toInt()) {
// 	    	println("*".repeat(n))
// 	  }
// }

