package day3

import kotlin.jvm.JvmStatic
import java.util.*

object UserInputExample : CalculatorExample() {

    var userInput = ""
    var number1 = 0
    var number2 = 0
    var answer = 0
    var operator = ""
    var scanner1 = Scanner(System.`in`)

    @JvmStatic
    fun main(args: Array<String>) {

        println("Enter Number 1 :")
        userInput = scanner1.nextLine()
        number1 = userInput.toInt()

        println("Enter Operatpr(+ - x %):")
        userInput = scanner1.nextLine()
        operator = userInput

        println("Enter Number 2 :")
        userInput = scanner1.nextLine()
        number2 = userInput.toInt()

        if (operator == "+") {
            answer = number1 + number2
        } else if (operator == "-") {
            answer = number1 - number2
        } else if (operator == "x") {
            answer = number1 * number2
        } else if (operator == "%") {
            answer = number1 / number2
        }

        println("Answer is :" + answer)
    }
}