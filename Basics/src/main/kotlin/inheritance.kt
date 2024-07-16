package org.example

//Init Block
class person (name:String){
    init{
        println("Name : $name")
    }
    fun Adhar(no : Int)
    {
        println("Adhar No : $no")
    }
}

//Inheritance

open class person1(name:String)
{
    init{
    println("My Name is = $name")
    }
    fun myAdhar(no:Int)
    {
        println("My Adhar No is = $no")
    }
}
class Teacher(name:String,clgName:String):person1("MCA")
{
    init{
        println("Your Name is :  $name Your College Name is : $clgName")
    }

}



fun main()
{
    var per=person("Krupali")
    per.Adhar(1425367896)
    var per1=person("Atmiya")
    per1.Adhar(1425367810)
    var t=Teacher("Neha","AU")
    t.myAdhar(347512542)

}