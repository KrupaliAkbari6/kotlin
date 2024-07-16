package org.example
//14. Write a program to swap two values without using third variable
fun main() {
    var a=10
    var b=20
    println("a=$a and b=$b")

    a=a+b //10+20=30
    b=a-b //30-20=10
    a=a-b //30-10=20

    println("a=$a and b=$b")
}