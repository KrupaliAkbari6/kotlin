package org.example

//45. Get a string from user and display it in lower case

fun main() {
    print("Enter a String : ")
    var name= readLine().toString()
    var str=name.lowercase()   //toLowerCase()
    print("The Name is : $str")
}