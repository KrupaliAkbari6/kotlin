package org.example

//30. Write a program input one integer number. Check whether number is equal to 10 or not.
fun main() {
    print("Enter a Number : ")
    var no=readLine()!!.toInt()

    if(no==10)
    {
        print("This Number is Equal to 10")
    }
    else{
        print("This Number does not Equal to 10")
    }
}