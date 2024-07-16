package org.example

//10. Write a program to calculate area of triangle (a = 1/2hb)
fun main() {
    print("Enter a Base of Triangle : ")
    var b= readLine()!!.toFloat()

    print("Enter a Height of Triangle : ")
    var h= readLine()!!.toFloat()

    print("Area of Triangle = ${0.5*h*b}")
}