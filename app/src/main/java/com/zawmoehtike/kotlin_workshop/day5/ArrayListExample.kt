package day5

import kotlin.jvm.JvmStatic
import day5.ArrayListExample
import java.util.*

object ArrayListExample {
    var favouriteFootballers = arrayListOf("Beckham", "Ronaldo", "Messi", "Luka Modric", "Maguire", "Mbappe")

    var favouriteMovies = arrayListOf<String>() // Empty String ArrayList

    @JvmStatic
    fun main(args: Array<String>) {

        // show all
        println("-------------Show All--------------")

        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        println("-------------Show All--------------")

        for(player in favouriteFootballers) {
            println(player)
        }

        println("-------------Replace--------------")

        favouriteFootballers[0] = "David Beckham"
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        println("-----------Insert----------------")

        favouriteFootballers.add("Neymar")
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        println("-----------Delete----------------")

        favouriteFootballers.removeAt(6)
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }
    }
}