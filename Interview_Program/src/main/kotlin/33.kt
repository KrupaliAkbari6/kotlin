package org.example

//33. Write a program input one integer number check whether is greater than 50 and less then 200.
fun main() {
    print("Enter a Number : ")
    var no=readLine()!!.toInt()

    if(no>50 && no<200)
    {
        print("The Number is greater than 50 and less than 200")
    }
    else
    {
        print("The Number does not greater than 50 and less than 200")
    }
}