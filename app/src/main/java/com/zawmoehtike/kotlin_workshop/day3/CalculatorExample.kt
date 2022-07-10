package day3

import kotlin.jvm.JvmStatic
import day3.CalculatorExample

open class CalculatorExample {
    companion object {

        var num1 = 0
        var num2 = 0
        var answer = 0
        var operator = ""

        @JvmStatic
        fun main(args: Array<String>) {
            num1 = 10
            num2 = 13

            answer = div(num1, num2)

            println("Answer is:" + answer)
        }

        fun sum(n1: Int, n2: Int): Int {
            return n1 + n2
        }

        fun sub(n1: Int, n2: Int): Int {
            return n1 - n2
        }

        fun multi(n1: Int, n2: Int): Int {
            return n1 * n2
        }

        fun div(n1: Int, n2: Int): Int {
            return n1 / n2
        }
    }
}