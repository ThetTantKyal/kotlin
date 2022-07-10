package com.zawmoehtike.kotlin_workshop.day2

import kotlin.jvm.JvmStatic

object VariablesAndMethodsExample {

    var name = "Joe Biden" // scope static type variable_name = value
    var age = 60
    var balance = 10000000.00

    @JvmStatic
    fun main(args: Array<String>) {
        println("Name is " + name) // Name is Zaw Moe Htike
        println("Age is " + (age + 1)) // Age is 25
        println("Balance is $" + balance) // Balance is $1.0E7

        showName()

        val nameTwo: String // nameTwo is initiated but not assign
        nameTwo = name // nameTwo is assigned
        println(nameTwo)
    }

    fun showName() { // showName method
        println(name) // Zaw Moe Htike
    }
}