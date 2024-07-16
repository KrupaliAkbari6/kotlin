package org.example

//28. Write a program to that accept the number from user and check it is divisible by 5 or not.
fun main() {
    print("Enter a number : ")
    var no=readLine()!!.toInt()

    if (no%5==0)
    {
        print("This number is Divisible by 5")
    }
    else
    {
        print("This number is Not Divisible by 5")
    }
}