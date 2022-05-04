// Author: Amir Bek aka Bek Brace
// Kotlin Introduction in minutes
// Collections

fun main() {
    val city1 = "Alexandria"
    val city2 = "Barcelona"
    val city3 = "Toronto"
    val city4 = "Berlin"
    val cities = mutableListOf<Any>("Alexandria","Barcelona", "Toronto", "Berlin")
    println(cities[0])
    cities.add("Rome")
    println(cities)
    cities.remove(cities[1])
    println(cities)
    cities.add(10)
    println(cities)
}