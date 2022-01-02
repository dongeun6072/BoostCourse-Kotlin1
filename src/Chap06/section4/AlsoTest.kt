package Chap06.section4

fun main() {

    data class Person(var name: String, var skills: String)
    val person = Person("Killdong" , "Kotlin")

    val a = person.also {
        it.skills = "Java"
    }

    println("a $a")
    println("person $person")

}