package chap05.section3

fun main() {
    retFunc()
}

inline fun inlineLamda(a: Int,b: Int, out: (Int,Int) -> Unit){
    out(a,b)
}

//일반 익명함수는 -> 비지역반환 x
//inline Lambda(13,3, fun(a,b) { ....->}

fun retFunc(){
    println("Start of Func")
    inlineLamda(12,3) lit@{ a,b ->
        val result = a + b
        if(result > 10) return@lit //라벨을 붙여주면 end of Func가 실행됨. or @inlineLamda 암묵적 라벨 가능
        println("result : $result")
    } //비지역 반환으로 이쪽으로 반환이 안됨 retFunc()함수를 빠져나간다
    println("end of Func")
}