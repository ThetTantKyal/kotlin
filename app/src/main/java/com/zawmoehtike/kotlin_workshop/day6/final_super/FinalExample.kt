package day6.final_super

import kotlin.jvm.JvmStatic
import day6.final_super.FinalExample

object FinalExample {

    var name = "David"
    const val finalName = "Johnson" // final variable cannot change

    @JvmStatic
    fun main(args: Array<String>) {
        name = "David 2"
        //finalName = "Johnson 2"
        println(finalName)
    }
}