package org.example

//9. Write a program to find volume of cylinder (v = 3.14r2h )
fun main() {
    print("Enter a radius : ")
    var r=readLine()!!.toFloat()

    print("Enter a Height of Cylinder : ")
    var h=readLine()!!.toFloat()

    print("Volume of Cylinder = ${3.14* r * 2 * h}")
}