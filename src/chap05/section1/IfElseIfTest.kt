package chap05.section1

fun main() {

    print("Enter the Score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score >= 90.0){
        grade = 'A'
    } else if (score in 80.0..89.9){ // 코틀린은 In 범위 연산자도 사용할 수 있다.
        grade = 'B'
    } else if (score >= 70 && score <= 79.9){
        grade = 'C'
    }

    println("score : $score , grade: $grade")

}