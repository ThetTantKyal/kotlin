package com.zawmoehtike.kotlin_workshop.day9;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeExample2 {
    
    public static void main(String[] args) {
        // Define Time Zone
        ZoneId tyoTimeZone = ZoneId.of("Asia/Tokyo");
        ZoneId ygnTimeZone = ZoneId.of("Asia/Rangoon");

        LocalTime myTime = LocalTime.now(); // take time from computer

        System.out.println("TYO time is " + myTime.now(Clock.system(tyoTimeZone)));
        System.out.println("YGN time is " + myTime.now(Clock.system(ygnTimeZone)));
    }
}
