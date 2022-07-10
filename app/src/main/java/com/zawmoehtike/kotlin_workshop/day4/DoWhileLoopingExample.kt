package com.zawmoehtike.kotlin_workshop.day4

import kotlin.jvm.JvmStatic

object DoWhileLoopingExample {

    @JvmStatic
    fun main(args: Array<String>) {
        // do while loop
        var counter3 = 1

        do { // 1 ... 10
            println("Counter3: $counter3")
            counter3++
        } while (counter3 <= 10)
    }
}