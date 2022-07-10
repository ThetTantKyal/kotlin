package com.zawmoehtike.kotlin_workshop.day2

object VariablesExample {
    var className = "DayTwoExample.java"
    var classStartName = 'D'
    var numberOfLinesS: Short = 10000
    var numberOfLines = 1000000000
    var numberOfLinesD = 1000000000.00
    var numberOfLinesF = 1000000000.00f
    var isItTrue = false

    @JvmStatic
    fun main(args: Array<String>) {
        println(className)
        println(classStartName)
    }
}