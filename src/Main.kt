fun main() {

    var a= arrayListOf<Int>(1,34,78,8,12,45,7,9,2,4,3,7,5,0,9)
    insertionSort(a)
    println(a)
 var b= arrayListOf<Int>(1,34,78,8,12,45,7,9,2,4,3,7,5,0,9)
    selectionSort(b)
    println(a)



}

fun insertionSort(array:ArrayList<Int>){
    var position:Int
    for (i in 1 until array.size){
        var temp=array[i]
        position=i

        while (0<position && temp<array[position-1]){

            var a=array[position]
            array[position]=array[position-1]
            array[position-1]=a
            position--

        }
    }

}
fun selectionSort(array: ArrayList<Int>){
    for (i in 0 until array.size-1){
        var smallPosition=i
        for (j in i+1 until array.size){
            if (array[j]<array[smallPosition]){
                smallPosition=j

            }
        }
        var a=array[i]
        array[i]=array[smallPosition]
        array[smallPosition]=a

    }
}