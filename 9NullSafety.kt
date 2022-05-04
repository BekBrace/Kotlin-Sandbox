// Author: Amir Bek aka Bek Brace
// Kotlin Introduction in minutes
// Null Safety Concept

fun main() {
    val data: String? = "Students Data Completed!"
    if (data != null) {
        println(data.lowercase())
    }
    println(data?.uppercase())
}