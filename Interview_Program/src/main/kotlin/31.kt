package org.example

//Write a program input one integer number check whether number is in between 0 to 100 or not.
fun main() {
    print("Enter a Number : ")
    var no=readLine()!!.toInt()

    if(no>0 && no<100)
    {
        print("The Number is in between 0 to 100 ")
    }
    else
    {
        print("The Number does not  between 0 and 100 ")
    }
}