package org.example
//34. Write a program input one integer number display appropriate day of week.

fun main() {
    print("Enter a Number between 1 to 7 : ")
    var no=readLine()!!.toInt()

    when(no)
    {
        1->print("Sunday")
        2->print("Monday")
        3->print("Tuesday")
        4->print("Wednesday")
        5->print("Thursday")
        6->print("Friday")
        7->print("Saturday")

        else->
        {
            print("Invalid Number ")
        }

    }
}