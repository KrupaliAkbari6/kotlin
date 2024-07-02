package org.example

fun printMsg(msg:String)
{
    println("Hello $msg")
}

fun printMsgWithPrefix(msg:String,prefixvar:String="Hello")
{
    println("prefix=$prefixvar || Greetings = $msg")
}

fun printprefix(roll : Int,msg:String,prefixvar:String="Hello")
{
    println("prefix=$prefixvar || Greetings = $msg || roll no =$roll")
}

//With return
fun sum(a:Int,b:Int):Int{
    print("Sum : ")
    return a+b
}


//Function with variable length arguments
fun printall(vararg msg:String)
{
    println()
    for(m in msg)
    {

        print("$m  ")
    }
}


fun main() {
    printMsg("Good Morning")
    printMsgWithPrefix("Good Morning")
    printMsgWithPrefix(prefixvar="hii",msg="Good Morning")
    printprefix(100,"goodmorning")
    printprefix(100,prefixvar="hii",msg="Good Morning")
    print(sum(10,20))
    printall("Atmiya","MCa","Krupali")
}