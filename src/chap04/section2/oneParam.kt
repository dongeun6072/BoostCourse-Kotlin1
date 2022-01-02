package chap04.section2

fun main() {
    oneParam({a -> "Hello World! $a"})
    oneParam {a -> "Hello World! $a"}
    oneParam {"Hello World! $it"}
}

fun oneParam(out: (String) -> String){
    println(out("oneParam"))
}