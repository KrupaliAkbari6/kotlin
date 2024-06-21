package org.example

class kotlinDemo(var name:String)
{
    fun greet()
    {
        print("Good Morning $name")
    }
}

fun main()
{
    kotlinDemo("Atmiya").greet()
}