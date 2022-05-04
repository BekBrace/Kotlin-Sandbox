// Author: Amir Bek aka Bek Brace
// Kotlin Introduction in minutes
// Loops

fun main() {
    val cities = listOf("Alexandria","Barcelona", "Toronto", "Berlin")
    //For Loop
    for (city in cities) {
        println(city)
    }

    for (i in 1 .. 4)
        println(i)

    for (i in 1 until 5)
        println(i)

    //While Loop
    var index = 0
    while (index < cities.size){
        println("City at $index index is ${cities[index]}")
        index ++
    }
}










