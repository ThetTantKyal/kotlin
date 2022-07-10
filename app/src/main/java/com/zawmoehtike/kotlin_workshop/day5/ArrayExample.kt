package day5

import kotlin.jvm.JvmStatic

object ArrayExample {

    // Types of arrays - int, char, short, long, float, String, double, boolean, etc.
    var favouriteFootballers = arrayOf("C. Ronaldo", "Beckham", "Messi", "Bale", 10, 10.99, 10.99f, 'M', true, false)

    @JvmStatic
    fun main(args: Array<String>) {

        // print out - array
        println(favouriteFootballers)

        println("-------------------------------")

        // print out - number of data in array
        println(favouriteFootballers.size)

        println("-------------------------------")

        // print out - data in array - by using for looping
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        // print out - data in array - by using for looping
        for (player in favouriteFootballers) {
            println(player)
        }

        println("-------------------------------")
    }
}