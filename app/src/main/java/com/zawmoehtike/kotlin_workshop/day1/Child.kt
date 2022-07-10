package com.zawmoehtike.kotlin_workshop.day1

import kotlin.jvm.JvmStatic

object Child : Parent() {

    @JvmStatic
    fun main(args: Array<String>) {
        home1.stay()
        car1.drive()
        car1.stop()
    }
}