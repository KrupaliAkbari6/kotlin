package org.example

class Employee
{
    constructor()
    {
        println("Hello World")
    }
}

//Default
class Person constructor(var no :Int, var Pname:String, var salary:Long)
{
    constructor() :this(101,"Atmiya",10000)
    {
        println("$no and $Pname and $salary")
    }
}


//Parameter
class Person1 constructor(var no :Int, var Pname:String, var salary:Long)
{
    constructor( Id:Int,  Pname:String) :this(101,"Atmiya",10000)
    {
        this.no=Id
        this.Pname=Pname
        println("$Id and $Pname and $salary")
    }
}

fun main() {
    var Emp1=Employee()
    var per=Person(102,"Krupali",12000)
    println(per.salary)
    var per1=Person1(105,"Neha")
    println(per1.no)
}