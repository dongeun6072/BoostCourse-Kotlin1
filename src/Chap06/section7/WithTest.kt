package Chap06.section7

fun main() {
    data class User(val name: String, var skills: String, var email: String?= null)
    val user = User("killdong", "default")

    val result = with(user){
        skills = "kotlin"
        email = "kildong@example.com" //마지막식이 없다면 Unit이반환
    }
    println(user)
    println("result: $result")
}