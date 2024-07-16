package org.example

fun main() {
   //48. Print 1 to 10
    for (i in 1..10)
    {
        print("$i ")
    }
    println()

    // 49. Print 2 4 6 8 10
    for(i in 2..10 step 2)
    {
        print("$i ")
    }
    println()

    //50. Print 1 3 5 7 9
    for(i in 1..10 step 2)
    {
        print("$i ")
    }
    println()

    //51. Print 1 2 4 8 16 32 64 128 256 512 1024
    var number = 1
    repeat(11) {
        print("$number ")
        number *= 2
    }
    println()
    var no=1
    print("$no ")
    while(no<1024)
    {
        no*=2
        print("$no ")
    }
    println()

    //52. Print 10 to 1
    for(i in 10 downTo 1)
    {
        print("$i ")
    }
    println()

    //53. Print 1 10 2 9 3 8 4 7 5 6


}
