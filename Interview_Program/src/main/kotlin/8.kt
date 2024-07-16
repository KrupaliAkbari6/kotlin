package org.example
//8. The distance between two cities is input through keyboard.
// Write a program to convert and print this distance in feet, meter, inch and centimeter

fun main() {
    print("Enter a distance between two cities(Km) :")
    var distance = readLine()!!.toFloat()

    var meter = distance * 1000
    println("$distance Km = $meter Meter")

    var cm=meter*100
    println("$distance Km = $cm CentiMeter")

    var feet=meter*3.28084
    println("$distance Km = $feet Feet")

    var inch=meter*39.3701
    println("$distance Km = $inch Inch")
}