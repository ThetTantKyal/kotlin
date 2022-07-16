package com.zawmoehtike.kotlin_workshop.day7

import java.lang.Exception
import kotlin.jvm.JvmStatic

object DataTypeConversionExample {
    @JvmStatic
    fun main(args: Array<String>) {
        // int age = 24;
        val age = "24"
        val height = "5.8" // to integer -> 5, to double -> 5.8
        val name = "Zaw"

        val integerAge = age.toInt() // Float.parseFloat(x)
        val currentAge = integerAge + 20
        val currentHeight = height.toDouble() + 0.2
        val fullName = "$name Moe Htike"

        try { // Error တက်နိုင်တဲ့ code တွေကို try ထဲမှာဝင်ရေးနိုင်တယ်
            val integerName = fullName.toInt()
        } catch (e: Exception) {
            // todo: nothing
        }

        println("Current Age: $currentAge")
        println("Current Heigh: $currentHeight")
        println("Full Name: $fullName")
    }
}