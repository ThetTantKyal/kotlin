package com.zawmoehtike.kotlin_workshop.day9

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import kotlin.jvm.JvmStatic

internal object DateTimeExample1 {

    @RequiresApi(Build.VERSION_CODES.O)
    @JvmStatic
    fun main(args: Array<String>) {
        val studentName = "Biber"
        val today = LocalDate.now() // today date or current date
        val yesterday = today.minusDays(1) // yesterday date
        val tomorrow = yesterday.plusDays(2) // tomorrow date
        val tomorrow2 = today.plusDays(1) // tomorrow date
        println("Today date: $today")
        println("Yesterday date: $yesterday")
        println("Tomorrow date: $tomorrow")
        println("Tomorrow2 date: $tomorrow2")

        // ------------------------------------------------------------------------------------------------------
        val myBirthday = LocalDate.of(2001, 1, 1) // birthday date
        println("My birthday is: $myBirthday")

        // ------------------------------------------------------------------------------------------------------
        val stringDate = "2011-09-01"
        val stringDateValue =
            LocalDate.parse(stringDate) // stringDate is converted to stringDateValue
        println("String Date is: $stringDate")
        println("String Date Value is: $stringDateValue")

        // ------------------------------------------------------------------------------------------------------
        val kyalKyalBirthday = LocalDate.of(2001, 1, 1)
        val zawBirthday = LocalDate.of(1991, 1, 1)
        if (kyalKyalBirthday.isAfter(zawBirthday)) { // 2001-01-01 > 1991-01-01
            println("Kyal Kyal is younger")
        } else {
            println("Kyal Kyal is older")
        }
    }
}