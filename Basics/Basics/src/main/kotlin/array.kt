package org.example

fun main() {
    var array1=Array(5){0}
    var array2=Array<Int>(5){0}
    println(array1[2])
    println(array2[2])

    var array3=arrayOf(1,2,3,4,5,6)
    println(array3[3])

    var array4=arrayOf<Int>(5,6,7,8,9,10)
    println(array4[3])

    var array5=arrayOf<String>("atmiya","Mca","Sem-3")
    println(array5[2])

    var array6=arrayOf(1,2,3,"MCA","a","Atmiya",8,"Hello",2,5)
    println(array6[3])


}