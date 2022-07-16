package com.zawmoehtike.kotlin_workshop.day9

import android.os.Build
import androidx.annotation.RequiresApi
import kotlin.jvm.JvmStatic
import com.zawmoehtike.kotlin_workshop.day9.TimeExample1
import java.time.LocalTime
import java.time.format.DateTimeFormatter

object TimeExample1 {

    @RequiresApi(Build.VERSION_CODES.O)
    @JvmStatic
    fun main(args: Array<String>) {

        // Formatter for time
        val time12HrFormatter = DateTimeFormatter.ofPattern("hh:mm:ss:ms a")
        val nowTime = LocalTime.now()
        println("nowTime is $nowTime") // Show with 24 Hour format

        val myTime = LocalTime.of(8, 59, 59)
        println("myTime is $myTime")

        val myTimeMinus1Hr29Min29Sec = myTime.minusHours(1).minusMinutes(29).minusSeconds(29)
        println("myTimeMinus1Hr29Min29Sec is $myTimeMinus1Hr29Min29Sec")

        val myPreviousTime = myTimeMinus1Hr29Min29Sec.plusHours(1).plusMinutes(29).plusSeconds(29)
        println("myPreviousTime is $myPreviousTime")
        println("nowTime(12 Hour Format) is " + nowTime.format(time12HrFormatter)) // Show with 12 Hour format
        println("myTime(12 Hour Format) is " + myTime.format(time12HrFormatter)) // Show with 12 Hour format
        println(
            "myTimeMinus1Hr29Min29Sec(12 Hour Format) is " + myTimeMinus1Hr29Min29Sec.format(
                time12HrFormatter
            )
        )

        // Show with 12 Hour format
        println("myPreviousTime(12 Hour Format) is " + myPreviousTime.format(time12HrFormatter)) // Show with 12 Hour format

        // --------------------------------------------------------------------------------------------------------------------------------------------------------
        val zawTime = LocalTime.of(11, 0, 0)
        val kyalKyalTime = LocalTime.of(11, 0, 0)

        compareTime(zawTime, kyalKyalTime)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun compareTime(myTime: LocalTime, yourTime: LocalTime) {
        if (myTime == yourTime) {
            println("My Time is same with Your Time")
        } else if (myTime.isAfter(yourTime)) {
            println("My Time is faster than Your Time")
        } else if (!myTime.isAfter(yourTime)) { // !myTime.isAfter(yourTime) or yourTime.isAfter(myTime)
            println("My Time is later than Your Time")
        }
    }
}