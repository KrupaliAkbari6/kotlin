package org.example
//import kotlin.collections.ArrayList

fun main() {
    var arr=ArrayList<String>()
    arr.add("Atmiya")
    arr.add("John")
    arr.add("MCA")
    arr.add(1,"Sem-3")
    println(arr)

    var arr1=arr.toArray()
    println(arr1[3])

    arr.add("Krupali")
    println(arr)

    println(arr.contains("Kotlin"))
    arr.remove("John")
    println(arr)
    println(arr.contains("John"))
    arr.set(0,"Hello") //replace
    println(arr)


}