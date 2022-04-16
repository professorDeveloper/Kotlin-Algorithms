package pdpMasla1

// She'll sort
internal class ShellSort {
    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    fun shellSort(array: IntArray, n: Int) {
        var interval = n / 2
        while (interval > 0) {
            var i = interval
            while (i < n) {
                val temp = array[i]
                var j: Int = i
                while (j >= interval && array[j - interval] > temp) {
                    array[j] = array[j - interval]
                    j -= interval
                }
                array[j] = temp
                i += 1
            }
            interval /= 2
        }
    }




}