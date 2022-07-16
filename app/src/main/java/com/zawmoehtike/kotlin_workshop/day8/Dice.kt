package com.zawmoehtike.kotlin_workshop.day8

import kotlin.jvm.JvmStatic

import java.util.*

object Dice {


    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 1..10) {
            rollTheDice()
        }

        for (i in 1..10) {
            findLuckyLotteryTicket()
        }
    }

    fun rollTheDice() {
        // Random
        val random = Random()
        val randomNumberBetween1to6 = random.nextInt(6) + 1 // 1 to 6

        println("Random number between 1 and 6 is $randomNumberBetween1to6")
    }

    fun findLuckyLotteryTicket() {
        // Random
        val random = Random()
        val luckyLotteryTicket = (random.nextInt(9999999) + 1000000).toLong() // 1000000 to 9999999

        println("Lucky Lottery Ticket is $luckyLotteryTicket")
    }
}