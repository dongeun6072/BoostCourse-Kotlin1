package chap05.section1

import java.lang.reflect.Member

fun main() {
    val str : Any = 3
    val result = when(str){
        is String -> "문자열입니다."
        else -> false
    }

    println("result : $result")
}