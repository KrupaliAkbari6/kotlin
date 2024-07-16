package org.example

//25. Write a program to find minimum and maximum no from 2 numbers.
fun main() {
    print("Enter a First Number : ")
    var no1:Int=readLine()!!.toInt()

    print("Enter a Second Number : ")
    var no2:Int=readLine()!!.toInt()

    if(no1>no2)
    {
        println("Number One is Maximum Number")
        println("Number Two is Minimum Number")
    }
   else if(no2>no1)
    {
        println("Number One is Minimum Number")
        println("Number Two is Maximum Number")
    }
   else
    {
        println("Number is Zero")
    }
}