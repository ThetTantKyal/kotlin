package com.zawmoehtike.kotlin_workshop.day4

import kotlin.jvm.JvmStatic

object WhileLoopingExample {
    @JvmStatic
    fun main(args: Array<String>) {
        // while loop
        var counter = 1
        while (counter <= 10) { // 1 ... 10
            println("Counter: $counter")
            counter = counter + 1
        }

        println("-----------------")

        var counter2 = 0
        while (counter2 <= 9) { // 0 ... 9
            println("Counter2: $counter2")
            counter2++
        }
    }
}