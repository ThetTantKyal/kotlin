package day4

import kotlin.jvm.JvmStatic

object LoopingExample {
    @JvmStatic
    fun main(args: Array<String>) {

        //for loop
        for (i in 1..5) {
            println("Hello")
        }

        println("--------------------")

        println("Let's count to 10")
        for (i in 1..10) {
            println(i)
        }

        println("--------------------")

        //while loop
        var counter = 1
        while (counter <= 10) {
            println("counter :$counter")

            counter++
        }

        println("--------------------")

        var counter2 = 0

        while (counter2 <= 9) {
            println("cuunter2 :$counter2")

            counter2++
        }

        println("---------------------------")

        //do while loop
        var counter3 = 1

        do {
            println("counter3:$counter3")
            counter3++
        } while (counter3 <= 0)
    }
}