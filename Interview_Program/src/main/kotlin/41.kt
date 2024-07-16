package org.example

//41. Write a program to find number which number is divisible by 3 but not divisible by 7

fun main() {
    print("Enter a Number : ")
    var no=readLine()!!.toInt()

    if(no%3==0 && no %7!=0)
    {
        print("$no is divisible by 3 but not divisible by 7")
    }
    else
    {
        print("$no is not divisible by 3")
    }
}