package com.zawmoehtike.kotlin_workshop.day9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExample1 {

    public static void main(String[] args) {

        // Formatter for time
        DateTimeFormatter time12HrFormatter = DateTimeFormatter.ofPattern("hh:mm:ss:ms a");

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime is " + nowTime); // Show with 24 Hour format

        LocalTime myTime = LocalTime.of(8, 59, 59);
        System.out.println("myTime is " + myTime);

        LocalTime myTimeMinus1Hr29Min29Sec = myTime.minusHours(1).minusMinutes(29).minusSeconds(29);
        System.out.println("myTimeMinus1Hr29Min29Sec is " + myTimeMinus1Hr29Min29Sec);

        LocalTime myPreviousTime = myTimeMinus1Hr29Min29Sec.plusHours(1).plusMinutes(29).plusSeconds(29);
        System.out.println("myPreviousTime is " + myPreviousTime);

        System.out.println("nowTime(12 Hour Format) is " + nowTime.format(time12HrFormatter)); // Show with 12 Hour format
        System.out.println("myTime(12 Hour Format) is " + myTime.format(time12HrFormatter)); // Show with 12 Hour format
        System.out.println("myTimeMinus1Hr29Min29Sec(12 Hour Format) is " + myTimeMinus1Hr29Min29Sec.format(time12HrFormatter)); // Show with 12 Hour format
        System.out.println("myPreviousTime(12 Hour Format) is " + myPreviousTime.format(time12HrFormatter)); // Show with 12 Hour format

        // --------------------------------------------------------------------------------------------------------------------------------------------------------

        LocalTime zawTime = LocalTime.of(11, 00, 00);
        LocalTime kyalKyalTime = LocalTime.of(11, 00, 00);

        compareTime(zawTime, kyalKyalTime);
    }

    public static void compareTime(LocalTime myTime, LocalTime yourTime) {
        if(myTime.equals(yourTime)) {
            System.out.println("My Time is same with Your Time");
        } else if(myTime.isAfter(yourTime)) {
            System.out.println("My Time is faster than Your Time");
        } else if(!myTime.isAfter(yourTime)) { // !myTime.isAfter(yourTime) or yourTime.isAfter(myTime)
            System.out.println("My Time is later than Your Time");
        }
    }
}
