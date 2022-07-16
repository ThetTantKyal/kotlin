package com.zawmoehtike.kotlin_workshop.day8

import kotlin.jvm.JvmStatic

import java.util.*

object MathExample {

    var scanner1 = Scanner(System.`in`)

    @JvmStatic

    fun main(args: Array<String>) {

        println("Enter Double Number: ")

        val doubleNumberInput = scanner1.nextLine() // "90"
        val doubleNumber = doubleNumberInput.toDouble() // 90

        calculateMath(doubleNumber)
        calculateEnergy(doubleNumber)
    }

    private fun calculateMath(number: Double) {

        println("Maximum number of " + number + " and 100 is: " + Math.max(number, 100.0))

        // return the square root of y
        println("Square root of " + number + " is: " + Math.sqrt(number))

        // returns 28 power of 4 i.e. 28*28*28*28
        println("Power of " + number + " and 2 is: " + Math.pow(number, 2.0))

        // return the logarithm of given value       
        println("Logarithm of " + number + " is: " + Math.log(number))

        // return the logarithm of given value when base is 10      
        println("log10 of " + number + " is: " + Math.log10(number))

        // return the log of x + 1  
        println("log1p of " + number + " is: " + Math.log1p(number))

        // return a power of 2    
        println("exp of " + number + " is: " + Math.exp(number))

        // return (a power of 2)-1  
        println("expm1 of " + number + " is: " + Math.expm1(number))
    }

    fun calculateEnergy(mass: Double) {
        // credit Estein
        val speedOfLight = 3 * Math.pow(10.0, 8.0) // 3 * (10 power 8)
        val energy = mass * speedOfLight

        println("Energy of $mass is $energy")
    }
}