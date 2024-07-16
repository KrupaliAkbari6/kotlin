package org.example

//3. Write a program that accept two numbers and perform all basic mathematical operation and print.

fun main() {
    println("Mathematical Operation")
    print("Enter First Number : ")
    var no1=readLine()!!.toInt()
    print("Enter Second Number : ")
    var no2=readLine()!!.toInt()

    println("Addition is : ${no1+no2}")
    println("Subtraction is : ${no1-no2}")
    println("Multiplication is : ${no1*no2}")
    println("Division is : ${no1/no2}")
    println("Modulus is : ${no1%no2}")
}