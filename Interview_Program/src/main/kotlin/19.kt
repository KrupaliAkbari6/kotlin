package org.example
//19. Write a program to read the value of X and Y and print the result of following expression
//(2X+3Y)/XY
fun main() {
    print("Enter the value of X : ")
    var x=readLine()!!.toLong()

    print("Enter the value of Y : ")
    var y=readLine()!!.toLong()

    println("Value of X is $x and value of Y is $y")
    println("Expression (2X+3Y)/XY   = ${((2*x)+(3*y))/x*y}")
}