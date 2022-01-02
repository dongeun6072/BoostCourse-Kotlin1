package chap05.section1

fun main() {

    print("Enter the Score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'


    when(score){ //인자가 있는 when
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
       /* else -> grade = 'F'*/
    }

 /*   when { 인수가 없는 when의 사용
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
    }*/


    println("score : $score , grade: $grade")

}