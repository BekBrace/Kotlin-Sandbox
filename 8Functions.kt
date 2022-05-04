// Author: Amir Bek aka Bek Brace
// Kotlin Introduction in minutes
// Functions

fun sayHello() {
    println("Hello!")
}

private fun sayHelloToSomeone(name: String) {
    println("Hello, $name !")
}

fun add() : Int = 20 + 30

fun divide(x:Int, y:Int): Int = x / y

fun main() {
    sayHello()
    sayHelloToSomeone("John")
    println(add())
    println(divide(x=100, y=50))
}