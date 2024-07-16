package org.example

//26. Write a program to check number is odd or even
fun main() {
    print("Entre a Number  : ")
    var no=readLine()!!.toInt()

    if (no%2==0)
    {
        println("Even Number")
    }
    else if (no==0)
    {
        println("number is Zero")
    }
    else
    {
        println("Odd Number ")
    }

}