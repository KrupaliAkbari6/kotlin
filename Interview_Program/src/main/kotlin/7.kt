package org.example

//7. Write a program to convert KM into Meter
fun main() {
    print("Enter a KiloMeter : ")
    var km=readLine()!!.toFloat()

    print("$km Km = ${km*1000} Meter ")
}