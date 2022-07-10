package day5

import kotlin.jvm.JvmStatic
import day5.ListExample
import java.util.*

object ListExample {

    var favouriteFootballers = arrayListOf("Beckham", "Ronaldo", "Messi", "Luka Modric", "Maguire", "Mbappe") // Non-Empty String List

    var multiTypeList = listOf("Beckham", 10, 10.0, true, false)
    var singleTypeList = listOf<String>("Beckham", "Ronaldo", "Messi")

    @JvmStatic
    fun main(args: Array<String>) {

        // show all
        println("-------------Show All--------------")

        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        println("-------------Show All--------------")

        for(item in favouriteFootballers) {
            println(item)
        }

        // replace/set one
        println("-------------Replace--------------")

        favouriteFootballers[0] = "David Beckham"
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        // add/insert one
        println("-----------Insert----------------")

        favouriteFootballers.add("Neymar")
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }

        // remove/delete one
        println("-----------Delete----------------")

        favouriteFootballers.removeAt(6)
        for (i in favouriteFootballers.indices) {
            println(favouriteFootballers[i])
        }
    }
}