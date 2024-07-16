package org.example
//21. Write a program that accept 5 numbers from user and find average of the value.

fun main() {
    print("Enter First Number : ")
    var first=readLine()!!.toFloat()

    print("Enter Second Number : ")
    var second=readLine()!!.toFloat()
    print("Enter Third Number : ")
    var third=readLine()!!.toFloat()

    print("Enter Fourth Number : ")
    var fourth=readLine()!!.toFloat()

    print("Enter Fifth Number : ")
    var fifth=readLine()!!.toFloat()

    println("Average of Five Numbers is = ${(first+second+third+fourth+fifth)/5}")
}