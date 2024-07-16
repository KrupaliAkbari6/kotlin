package org.example

//11. Write a program to calculate area and perimeter of the rectangle.
fun main() {
    print("Enter a Length of Rectangle : ")
    var l= readLine()!!.toFloat()

    print("Enter a Width of Rectangle : ")
    var w=readLine()!!.toFloat()

    var area=l*w
    var perimeter=2*(l+w)

    println("Area of Rectangle = $area")
    println("Perimeter of Rectangle = $perimeter")
}