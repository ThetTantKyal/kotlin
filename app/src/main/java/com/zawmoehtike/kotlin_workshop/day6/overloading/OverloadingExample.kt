package day6.overloading

import kotlin.jvm.JvmStatic

object OverloadingExample {

    @JvmStatic
    fun main(args: Array<String>) {
        val adder1 = Adder()

        adder1.sum(1, 4)
        adder1.sum(1, 4, 5)
        adder1.sum(1, 4, 5, 6)
    }
}