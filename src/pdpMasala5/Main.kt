package pdpMasala5

import java.util.*
import kotlin.math.sqrt



fun main(ar: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Array uzunligi  :")
    val n = sc.nextInt()
    val a = IntArray(n)
    println("Arraydagi elementlar :")
    for (i in 0 until n) {
        println("${i.plus(1)}] element : ")
        a[i] = sc.nextInt()
    }
    print("[")
    for (i in a) {
        print("$i,")

    }
    println("]")
    val block = sqrt(n.toDouble()).toInt()
    println("qidirilayotgan element :")
    val x = sc.nextInt()
    if (x > a[n - 1] || x < a[0]) {
        println("Bunday element arrayda yuq")
        return
    }
    var i = 0
    var j = block
    while (a[j] < x && j < n) {
        i = j
        j += block
        if (j > n - 1) {
            j = n - 1
        }
    }
    for (k in i..j) {
        if (a[k] == x) {
            println("is Success !")
            println("element :" + (k + 1))
            return
        }
    }
}