package org.example

//38. Enter age of person and display message as Up to 5 year Kid
//      5- 12  Children
//      13 – 19 Teenager
//      20 – 30  Young
//      31 – 60  Mid age group
//      60 or above  Old

fun main() {
    print("Enter the Age of Person : ")
    var age=readLine()!!.toInt()

    if(age>0 && age<5)
    {
        print("Kid")
    }
    else if(age>=5 && age<=12)
    {
        print("Children")
    }
    else if(age>=13 && age<=19)
    {
        print("Teenager")
    }
    else if(age>=20 && age<=30)
    {
        print("Young")
    }
    else if(age>=31 && age<60)
    {
        print("Mid age group")
    }
    else if(age>=60)
    {
        print("Old")
    }
    else
    {
        ("Invalid Input")
    }
}