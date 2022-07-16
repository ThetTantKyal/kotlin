package com.zawmoehtike.kotlin_workshop.day7

import kotlin.jvm.JvmStatic
import com.zawmoehtike.kotlin_workshop.day7.TryCatchExample
import java.lang.Exception

object TryCatchExample {
    var teacherName = "Zaw"
    var studentName: String? = null
    var number1 = 1
    var answer = 0

    @JvmStatic
    fun main(args: Array<String>) {
        println(teacherName)
        println(studentName)

        //answer = number1 / 0;
        try {
            // Error တက်နိုင်တဲ့ code တွေကို try
            answer = number1 / 0
        } catch (e: Exception) {
            // Error ကို handle လုပ်တဲ့ code တွေကို catch
            answer = 10
        }
        println(answer)
    }
}