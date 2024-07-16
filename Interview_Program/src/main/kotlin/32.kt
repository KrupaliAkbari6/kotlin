package org.example

//32. Write a program input one integer number check whether number is four digits or not.
fun main() {
    print("Enter a Number : ")
    var no=readLine()!!.toInt()

    if(no>1000 && no<9999)
    {
        print("The Number is Four Digits Number")
    }
    else
    {
        print("The Number does not Four Digits Number")
    }
}