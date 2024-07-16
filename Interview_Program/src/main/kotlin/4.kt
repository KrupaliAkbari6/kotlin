package org.example

//4. Write a program to calculate simple interest.
fun main() {
    print("Enter a Principal Amount = ")
    var principal_amount: Int = readLine()!!.toInt()

    print("Enter Annual Rate = ")
    var annual_rate: Int = readLine()!!.toInt()

    print("Entet a Number of Year = ")
    var noOfYear: Int = readLine()!!.toInt()

    println("Simple Interest = ${(principal_amount*annual_rate*noOfYear)/100}")

}