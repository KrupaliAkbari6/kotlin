package org.example

//44. Get a string from user and display it in upper case
fun main() {
    print("Enter a String : ")
    var name= readLine().toString()
    var str=name.uppercase()   //toUpperCase()
    print("The Name is : $str")
}