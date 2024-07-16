package org.example

fun main() {
    var pie : Float = 3.14f
    print("Enter Radius : ")
    var r=readLine()

    if (r.equals(""))
    {
        print("Null values")
    }
    else
    {
        var rad=readLine()!!.toFloat()
        var area = pie * rad * rad
        println("Area Of Circle is $area")
    }



}