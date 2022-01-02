package chap05.section2

fun main() {

    var total = 0

    for(num in 0..100 step 2) total += num

    print("홀수 합 : $total")
}