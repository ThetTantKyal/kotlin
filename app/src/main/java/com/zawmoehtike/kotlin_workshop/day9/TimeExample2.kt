package com.zawmoehtike.kotlin_workshop.day9

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Clock
import java.time.LocalTime
import java.time.ZoneId
import kotlin.jvm.JvmStatic

object TimeExample2 {

    @RequiresApi(Build.VERSION_CODES.O)
    @JvmStatic
    fun main(args: Array<String>) {

        // Define Time Zone
        val tyoTimeZone = ZoneId.of("Asia/Tokyo")
        val ygnTimeZone = ZoneId.of("Asia/Rangoon")
        val myTime = LocalTime.now() // take time from computer

        println("TYO time is " + LocalTime.now(Clock.system(tyoTimeZone)))
        println("YGN time is " + LocalTime.now(Clock.system(ygnTimeZone)))
    }
}