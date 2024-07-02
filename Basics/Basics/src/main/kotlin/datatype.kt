package org.example

fun main() {
    var name:String  //Declaration
    name="Atmiya"  //Define //Initialize
    println(name)

    var bytevar:Byte=123
    var shortvar:Short=4567
    var intvar:Int=1223455888
    var longvar:Long=1245387458569854258
    var floatvar:Float=78542.85f
    var doublevar:Double=7882472452.847518
    var charvar:Char='a'
    var stringvar:String="Atmiya"
    var booleanvar:Boolean=true

    println(bytevar)

    println(bytevar::class.simpleName)
    println(shortvar::class.simpleName)
    println(intvar::class.simpleName)
    println(longvar::class.simpleName)
    println(floatvar::class.simpleName)
    println(doublevar::class.simpleName)
    println(charvar::class.simpleName)
    println(stringvar::class.simpleName)
    println(booleanvar::class.simpleName)

    //RANGE

    println("Byte Range : "+Byte.MIN_VALUE+" To "+Byte.MAX_VALUE)
    println("Short Range : "+Short.MIN_VALUE+" To "+Short.MAX_VALUE)
    println("Int Range : "+Int.MIN_VALUE+" To "+Int.MAX_VALUE)
    println("Long Range : "+Long.MIN_VALUE+" To "+Long.MAX_VALUE)
    println("Float Range : "+Float.MIN_VALUE+" To "+Float.MAX_VALUE)
    println("Double Range : "+Double.MIN_VALUE+" To "+Double.MAX_VALUE)
    println("Char Range : "+Char.MIN_VALUE+" To "+Char.MAX_VALUE)


    //SIZE

    println("Byte var Occupies : ${java.lang.Byte.SIZE}" )
    println("Short var Occupies : ${java.lang.Short.SIZE}" )
//    println("Int var Occupies : ${java.lang.Int.SIZE}" )
    println("Long var Occupies : ${java.lang.Long.SIZE}" )
    println("Float var Occupies : ${java.lang.Float.SIZE}" )
    println("Double var Occupies : ${java.lang.Double.SIZE}" )
//    println("Char var Occupies : ${java.lang.Char.SIZE}" )
//    println("String var Occupies : ${java.lang.String.SIZE}" )
//    println("Boolean var Occupies : ${java.lang.Boolean.SIZE}" )









}