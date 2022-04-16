package pdpMasala2

fun main(args: Array<String>) {
    var mergeSort=MergeSort()
    val numbers = mutableListOf(38,27,43,3,82,10,11,2,9,46,7,8,1,)
    val sortedList = mergeSort.mergeSort(numbers)
    println("Unsorted: $numbers")
    println("Sorted: $sortedList")
}