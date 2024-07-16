package org.example

//15. Write a program to read the value of X and Y and print the result of following expression
//(X+Y)/(X-Y)

fun main() {
    print("Enter the value of X : ")
    var x=readLine()!!.toLong()

    print("Enter the value of Y : ")
    var y=readLine()!!.toLong()

    println("Value of X is $x and value of Y is $y")
    println("Expression (X+y)/(X-y) = ${(x+y)/(x-y)}")
}