package com.zawmoehtike.kotlin_workshop.day8

import kotlin.jvm.JvmStatic

import java.util.*

object TrigoExample {

    var scanner1 = Scanner(System.`in`)

    @JvmStatic
    fun main(args: Array<String>) {

        println("Enter Double Number: ")

        val doubleNumberInput = scanner1.nextLine() // "90"
        val doubleNumber = doubleNumberInput.toDouble() // 90

        calculateTrigo(doubleNumber) // 90


    }

    private fun calculateTrigo(number: Double) { // 90

        // return the trigonometric sine of a
        println("Sine value of " + number + " is: " + Math.sin(number)) // 90

        // return the trigonometric cosine value of a
        println("Cosine value of " + number + " is: " + Math.cos(number))

        // return the trigonometric tangent value of a
        println("Tangent value of " + number + " is: " + Math.tan(number))

        // return the trigonometric arc sine of a
        println("Sine value of " + number + " is: " + Math.asin(number))

        // return the trigonometric arc cosine value of a
        println("Cosine value of " + number + " is: " + Math.acos(number))

        // return the trigonometric arc tangent value of a
        println("Tangent value of " + number + " is: " + Math.atan(number))

        // return the hyperbolic sine of a
        println("Sine value of " + number + " is: " + Math.sinh(number))

        // return the hyperbolic cosine value of a  
        println("Cosine value of " + number + " is: " + Math.cosh(number))

        // return the hyperbolic tangent value of a  
        println("Tangent value of " + number + " is: " + Math.tanh(number))
    }
}