package org.example

//24. Write a program to find out minimum number from 2 numbers

fun main() {
    print("Enter a First Number : ")
    var no1:Int=readLine()!!.toInt()

    print("Enter a Second Number : ")
    var no2:Int=readLine()!!.toInt()

    if(no1<no2)
    {
        println("Number One is Less than Number two")
    }
    else
    {
        println("Number Two is Less than Number One")
    }
}