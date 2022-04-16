# Kotlin-Algroitms
Kotlin tutorial Algorithm Search


package pdpMasala6

import java.util.*

fun main(args: Array<String>) {
    var fibonacci=Fibonacci()
    val `in` = Scanner(System.`in`)
    println("This program produces the (n)th Fibonacci number.")
    println()
    var i = 0
    while (i < 1) {
        print("Choose an integer value greater than 1 to be n (Type '0' to quit): ")
        val n = `in`.nextInt()
        var f = 0
        if (n > 1) {
            f = fibonacci.fibonacci(n)
            println("The " + n + "th Fibonacci number is: " + f)
            println()
        } else if (n == 0) //terminating input
        {
            i++
        } else  //Error trap
        {
            println("Input not greater than 1. Try again.")
            println()
        }
        i += 0
    }
}

  
  
  
  //fibonachi Search algorithm 
![image](https://user-images.githubusercontent.com/103598601/163670409-b82314ab-a70b-4843-b773-9047c42fdda8.png)
