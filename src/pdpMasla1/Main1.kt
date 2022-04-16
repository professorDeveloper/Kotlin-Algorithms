package pdpMasla1

import java.util.*

fun main(args: Array<String>) {
    val data = intArrayOf(9, 8, 3, 7, 5, 6, 4, 1)
    val size = data.size
    val ss = ShellSort()
    ss.shellSort(data, size)
    println("Sorted Array in Ascending Order: ")
    println(Arrays.toString(data))
}