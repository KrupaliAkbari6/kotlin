package org.example

//29. Write a program that accept the number from user and check its negative, positive or zero
fun main() {
    print("Enter a number : ")
    var no=readLine()!!.toInt()

    if(no>0)
    {
        print("The Number is Positive")
    }
    else if (no==0)
    {
        print("The Number is Zero")
    }
    else
    {
        print("The Number is Negative")
    }

}