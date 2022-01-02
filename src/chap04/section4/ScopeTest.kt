package chap04.section4

var global = 10

fun main() {
    fun localFunc1(){
        println("localFunc1")
    }

    localFunc1()

   global = 15
    val local1 = 15
    println("Global : $global")
    userFunc()
    println("final - global: $global, local1 : $local1")
}

fun userFunc(){
    val local1 = 20 //생명 범위가 다르다 (자기의 범위안에서만 존재한다)
    global = 20
    println("userFunc- global: $global, local1 : $local1")

}