package org.example
//18. 18. Write a program to read the value of X and Y and print the result of following expression
//3X2+2XY+3Y2
fun main() {
    print("Enter the value of X : ")
    var x=readLine()!!.toLong()

    print("Enter the value of Y : ")
    var y=readLine()!!.toLong()

    println("Value of X is $x and value of Y is $y")
    println("Expression 3X2+2XY+3Y2   = ${(3*x*x)+(2*x*y)+(3*y*y)}")
}