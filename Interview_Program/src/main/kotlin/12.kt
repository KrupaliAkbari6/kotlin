package org.example

//12. Write a program to calculate area of circle

fun main() {
    var PI=3.14
    print("Enter a Radius : ")
    var r=readLine()!!.toFloat()

    print("Area of Circle = ${PI*r*r}")
}