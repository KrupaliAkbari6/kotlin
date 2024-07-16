package org.example

//22. Write a program to find out the net salary of an employee and get the basic salary from
//him. Applicable TA 4%, DA 30%, HRA 15% on basic salary. Applicable 3% tax 12% PF on
//basic salary.

fun main() {
    print("Enter your Salary : ")
    var basic_sal=readLine()!!.toInt()

    var ta=basic_sal*4/100
    var da=basic_sal*30/100
    var hra=basic_sal*15/100

    var tax=basic_sal*3/100
    var pf=basic_sal*12/100

    println("Basic Salary = $basic_sal")
    println("Net Salary = ${basic_sal+ta+da+hra-(tax+pf)}")
}