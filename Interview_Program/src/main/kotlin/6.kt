package org.example

//6. Write a program to calculate 10% bonus of salary.

fun main() {
    print("Enter Your Salary : ")
    var sal:Int=readLine()!!.toInt()

    var bonusRate=10

    println("Total Salary is : $sal")
    println("Bonus Amount : ${sal*10/100}")
    println("Salary with Adding Bonus Amount : ${sal+(sal*10/100)}")
}