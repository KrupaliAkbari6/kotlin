package org.example

fun main() {
    for(i in 1 .. 10)
    {
        print("$i ")
    }
    println()
    print("Odd Numbers : ")
    for(i in 1..10 step 2)
    {
        print("$i ")
    }
    println()
    print("Even Numbers : ")
    for(i in 2..10 step 2)
    {
        print("$i ")
    }
    println()
    for(i in 1..10 step 3)
    {
        print("$i ")
    }
    println()
    print("Reverse Number :")
    for(i in 10 downTo 1)
    {
        print("$i ")
    }
    println()
    print("Reverse Number :")
    for(i in 10 downTo 1 step 2)
    {
        print("$i ")
    }

}