package org.example

//42. Write a program that reads a sales bill amount calculate discount on bill amount
//as follows if bill amount less than 5000 calculate 7.5% discount on bill amount
//otherwise calculate 11% discount on bill.
//Print bill amount discount amount and net payable bill

fun main() {
    print("Enter a Bill Amount : ")
    var bill_amt=readLine()!!.toInt()

    if (bill_amt <=0) {
        print("Invalid Amount Enter")
    }
    else if(bill_amt <5000) {
        println("Bill Amount is : $bill_amt")
        var discount=bill_amt*(7.5/100)
        println("Discount on Bill Amount : $discount")
        println("Total Payable Amount is : ${bill_amt-discount} ")
    }
    else {
        println("Bill Amount is : $bill_amt")
        var disc=(bill_amt*(11/100))
        println("Discount on Bill Amount : $disc")
        println("Total Payable Amount is : ${bill_amt-disc} ")
    }
}