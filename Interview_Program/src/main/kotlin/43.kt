package org.example

//43. An electric power distribution company charger its domestic customers as follows
//Consumption unit rate of charge
//0 – 200      RS.0.50 per unit
//201 – 400    RS.100 + RS. 0.65 per unit
//401 – 600    RS. 230 + RS. 0.80 per unit
//601 and above RS. 390 + RS. 1.00 per unit
//
//Read the customer number and power consumed and print the amount to be paid by
//the customer

fun main() {
    print("Enter a Unit : ")
    var unit= readLine()!!.toInt()

    if(unit>=0 && unit<=200)
    {
        print("Amount to be Paid By the Customer : ${unit*0.50}")
    }
    else if(unit>=201 && unit<=400)
    {
        print("Amount to be Paid By the Customer : ${100+(unit-200)*0.65}")
    }
    else if(unit>=401 && unit<=600)
    {
        print("Amount to be Paid By the Customer : ${230+(unit-400)*0.80}")
    }
    else if(unit>=601)
    {
        print("Amount to be Paid By the Customer : ${390+(unit-600)*1}")
    }
}