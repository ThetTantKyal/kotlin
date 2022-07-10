package com.zawmoehtike.kotlin_workshop.day10

import java.util.*
import kotlin.jvm.JvmStatic

internal object StringExample {

    @JvmStatic
    fun main(args: Array<String>) {
        val name = "John Smith"

        println(name)

        println("length: " + name.length) // string.length

        for (i in 0..name.length-1) {
            println(name[i]) // string.charAt(i)
        }

        for (item in name) {
            println(item) // string.charAt(i)
        }

        val description = "My name is Zaw. Zaw is a programmer. Zaw is good at swimming but bad at football"

        println(description)
        println(description.replace("Zaw".toRegex(), "Moe")) // string.replaceAll(i, j)
        println(description.replace(" ", "_"))
        println(description.lowercase()) // string.toLowerCase()

        val upperCaseDescripiton = description.uppercase() // string.toUpperCase()
        println(upperCaseDescripiton)

        val fakePassword = " Ro ot "
        println(fakePassword)
        println(fakePassword.trim()) // string.trim()

        val name1 = "JOE"
        val name2 = "joe"
        if (name1 == name2) { // string1.equals(string2) or string1.equalsIgnoreCase(string2)
            println("$name1 = $name2")
        } else {
            println("$name1 != $name2")
        }
        val someComment = "Hello bro! Shit! Fuck you bitch!"
        val censorComment = someComment.replace("(?i)fuck".toRegex(), "****")
            .replace("(?i)shit".toRegex(), "****")
            .replace("(?i)bitch".toRegex(), "*****")
        println(censorComment)
        println(someComment)
    }
}