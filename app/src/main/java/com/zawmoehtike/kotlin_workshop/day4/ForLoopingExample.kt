package com.zawmoehtike.kotlin_workshop.day4

import kotlin.jvm.JvmStatic

object ForLoopingExample {

    @JvmStatic
    fun main(args: Array<String>) {
        // for loop
        for (i in 1..5) { // 1, 2, 3, 4, 5
            println("Hello!")
        }
        for (i in 0..4) { // 0, 1, 2, 3, 4
            println("World!")
        }
        for (i in 1..10) { // 1, 2, 3, 4, 5, ..., 10
            println("Let count to 10!")
        }
        for (i in 0..9) { // 1, 2, 3, 4, 5, ..., 10
            println("Let count to 10!")
        }
        for (i in 1..10) { // 1, 2, 3, 4, 5, ..., 10
            println(i)
        }
        for (i in 0..9) { // 0, 1, 2, 3, 4, 5, ..., 9
            println(i)
        }

        // Infinite for loop
        /*
        for(;;) {
            System.out.println("Infinite loop");
        }
        */
    }
}