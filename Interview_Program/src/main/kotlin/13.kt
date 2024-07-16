package org.example
//13. Write a program to swap two values
fun main() {
    print("Enter First Value : ")
    var a=readLine()

    print("Enter Second Value : ")
    var b=readLine()
    println("a=$a and b=$b")

    var temp=a
    a=b
    b=temp
    println("a=$a and b=$b")
}