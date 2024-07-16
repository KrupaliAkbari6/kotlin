package org.example

//27. Write a program that accepts the year from user and check it leap year or not.
//Logic-> divisible by 4 and not divisible by 100
fun main() {
    print("Enter a Year : ")
    var year=readLine()!!.toInt()

    if(year%4==0 && year%100!=0) {
        print("This year is Leap Year")
    }
    else
    {
        print("This year is not Leap Year")
    }
}