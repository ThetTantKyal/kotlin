package com.zawmoehtike.kotlin_workshop.day2

import kotlin.jvm.JvmStatic

object ConditionsExample {

    var iLikePizza = false
    var myFavouriteNumber = 3
    var myAge = 25

    @JvmStatic
    fun main(args: Array<String>) {
        if (myAge < 30) {
            println("Your age is less than 30")
        }
        if (myAge > 20) {
            println("Your age is greater than 20")
        }
        if (myAge == 25) {
            println("Your age is 25")
        }
        if (myAge != 35) {
            println("Your age not 35")
        }
    }
}