package org.example

//20. Write a program to convert negative to positive and positive to negative
fun main() {
    print("Enter any Positive or Negative Number : ")
    var no=readLine()!!.toInt()

    if(no>0)
    {
        println("Positive to Negative ${-no}")
    }
    else
    {
        println("Negative to Positive ${-no}")
    }
}