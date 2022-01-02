package Chap06.Section1

fun main() {
    val score: Int? = 32

    fun checkScore(){
        if(score != null){
            println("score : $score")
        }
    }

    fun checkScoreLet(){
        score?.let{println("Scroe: $it")}
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()
}