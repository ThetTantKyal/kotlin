package day4

import kotlin.jvm.JvmStatic

object ArrayExample {
    var number1 = 0 // int variable
    var numberArray = arrayOf(0, 1, 2, 3, 4) // int array

    var string1 = "Zaw"
    var stringArray = arrayOf("Zaw", "ZAw", "zAw", "Loremp ipsm asfasfe") // String array
    var charArray = charArrayOf()

    @JvmStatic
    fun main(args: Array<String>) {

        val number2 = 0 // int

        println(number1)
        println(numberArray)
        println(stringArray[0])
    }
}