package pdpMasla4

fun main(args: Array<String>) {
    var heapSort=HeapSort()
    val array = intArrayOf(4, 1, 3, 2, 16, 9, 10, 14, 8, 7)
    print("no Sorted :")
    for (i in array) {
        print("$i ,")
    }
   heapSort.buildMaxHeap(array)

    for (i in array.size - 1 downTo 1) {
        val temp = array[0]
        array[0] = array[i]
        array[i] = temp
        heapSort.maxHeapify(array, 0, i - 1)
    }
    println()
    print("sorted :")
    for (i in array) {
        print("$i,")
    }

}