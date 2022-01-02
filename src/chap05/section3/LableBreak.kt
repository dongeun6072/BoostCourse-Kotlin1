package chap05.section3

fun main() {
    labelBreak()
}

fun labelBreak(){
    println("labelBreak")
    first@ for(i in 1..5){
        for(j in 1..5){
            if(j == 3) break@first
                println("i:$i, j:$j")
        }  // 라벨을 안 붙이면 여기서 탈출한다.
        println("after for j")
    } //라벨을 붙이면 여기를 탈출한다.
    println("after for i")
}