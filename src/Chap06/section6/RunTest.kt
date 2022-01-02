package Chap06.section6

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Killdong" , "Kotlin")

    val retrunObj = person.apply {
        name = "Sean"
        skills = "Java"
        "success" // 사용되지 않음
    }

    println(person)
    println("retrunObj : $retrunObj")

    val retrunObj2 = person.run{
        name = "Dooly"
        skills = "C#"
        "success"
    }

    println(person)
    println("retrunObj2 : $retrunObj2")
}