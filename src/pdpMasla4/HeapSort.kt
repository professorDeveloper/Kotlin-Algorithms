package pdpMasla4

class HeapSort {
    /**
     * Heap sort
     *
     * Given an array, sort it in ascending order using heap sort algorithm
     */



     fun buildMaxHeap(array: IntArray) {

        for (i in ((array.size/2) - 1) downTo 0) {
            maxHeapify(array, i)
        }

    }

     fun maxHeapify(array: IntArray, rootIndex: Int, heapSize: Int = array.size - 1) {

        val leftChildIndex = (2 * rootIndex) + 1
        val rightChildIndex = (2 * rootIndex) + 2
        var largestElementIndex = rootIndex

        if (leftChildIndex <= heapSize && array[leftChildIndex] > array[rootIndex]) {
            largestElementIndex = leftChildIndex
        }

        if (rightChildIndex <= heapSize && array[rightChildIndex] > array[largestElementIndex]) {
            largestElementIndex = rightChildIndex
        }

        if (largestElementIndex != rootIndex) {
            val temp = array[rootIndex]
            array[rootIndex] = array[largestElementIndex]
            array[largestElementIndex] = temp
            maxHeapify(array, largestElementIndex, heapSize)
        }

    }
}