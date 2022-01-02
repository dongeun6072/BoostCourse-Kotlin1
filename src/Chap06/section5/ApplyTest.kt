package Chap06.section5

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Killdong" , "Kotlin")

    person.apply { this.skills = "Swift" } // this로 받고 생략가능
    println(person)

    val returnObj = person.apply{
        name = "Sean"
        skills = "Java"
    }

    println(person)
    println(returnObj)
}