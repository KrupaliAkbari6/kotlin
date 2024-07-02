package org.example

fun main() {
    print("Enter Your Choice Numebr : ")
    var no : Int =readLine()!!.toInt()

    when(no)
    {
        1->print("One")
        2->print("Two")
        3->print("Three")
        4,5,6->
        {
            if(no==4)
            {
                print("Four")
            }
            if(no==5)
            {
                print("Five")
            }
            if(no==6)
            {
                print("Six")
            }
        }
        in(10..20)->
        {
            print("The Number is Between 10 To 20")
        }

        else->
        {
            print("Enter Valid Numebr")
        }

    }
}