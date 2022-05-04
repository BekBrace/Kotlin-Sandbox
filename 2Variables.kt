// Author: Amir Bek aka Bek Brace
// Kotlin Introduction in minutes
// Variables

fun main() {
    val myName = "Bek"
    var myAge = 40
    println(myName)
    println(myAge)

    var hugeInt: Int = Int.MAX_VALUE
    var tinyInt: Int = Int.MIN_VALUE

    println("The Biggest Integer: " + hugeInt)
    println("The Smallest Integer: $tinyInt") // string interpolation

    //LONG
    var hugeLong: Long = Long.MAX_VALUE
    var tinyLong: Long = Long.MIN_VALUE

    println("The Biggest long: " + hugeLong)
    println("The Smallest long: $tinyLong")

    //Double
    var hugeDouble: Double = Double.MAX_VALUE
    var tinyDouble: Double = Double.MIN_VALUE

    println("The Biggest double: " + hugeDouble)
    println("The Smallest double: $tinyDouble")

    //Float
    var hugeFloat: Float = Float.MAX_VALUE
    var tinyFloat: Float = Float.MIN_VALUE

    println("The Biggest float: " + hugeFloat)
    println("The Smallest float: $tinyFloat")
}