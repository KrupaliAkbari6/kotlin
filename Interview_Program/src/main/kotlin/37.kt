package org.example

//37. Write a program to find out minimum from three number
fun main() {
    print("Enter First Number : ")
    var no1=readLine()!!.toInt()

    print("Enter Second Number : ")
    var no2=readLine()!!.toInt()

    print("Enter Third Number : ")
    var no3=readLine()!!.toInt()

    if(no1<no2 && no1<no3)
    {
        print("Number One is Minimum Number ")
    }
    else if(no2<no1 && no2<no3)
    {
        print("Number Two is Minimum Number")
    }
    else
    {
        print("Number Three is Minimum Number ")
    }
}