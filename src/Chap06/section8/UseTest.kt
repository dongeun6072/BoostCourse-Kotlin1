package Chap06.section8

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {

    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use{
        it.println("hello")
    } //use에 close가 다 들어가있다.
}