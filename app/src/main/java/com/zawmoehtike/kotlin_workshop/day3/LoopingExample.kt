package com.zawmoehtike.kotlin_workshop.day3

import kotlin.jvm.JvmStatic

object LoopingExample {

    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 1..10) {
            for (ii in 1..i) {
                print("*")
            }
            println("")
        }
    }
}