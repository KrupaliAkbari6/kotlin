package org.example

class Demo (var no : Int,var name:String){
    fun greet()
    {
        println("No = $no and Name = $name")
    }

}

fun main() {
//    var d=Demo(1,"Krupali")
    var d=Demo(name="Krupali",no=1)
    d.greet()
    println(d.no)

    d.name="Kotlin"
    println(d.name)
    d.greet()
}