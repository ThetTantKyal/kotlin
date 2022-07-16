
package com.zawmoehtike.kotlin_workshop.day9;

import java.time.LocalDate;

class DateTimeExample1 {

    public static void main(String[] args) {
        String studentName = "Biber";

        LocalDate today = LocalDate.now(); // today date or current date

        LocalDate yesterday = today.minusDays(1); // yesterday date
        LocalDate tomorrow = yesterday.plusDays(2); // tomorrow date
        LocalDate tomorrow2 = today.plusDays(1); // tomorrow date

        System.out.println("Today date: " + today);
        System.out.println("Yesterday date: " + yesterday);
        System.out.println("Tomorrow date: " + tomorrow);
        System.out.println("Tomorrow2 date: " + tomorrow2);

        // ------------------------------------------------------------------------------------------------------

        LocalDate myBirthday = LocalDate.of(2001, 01, 01); // birthday date

        System.out.println("My birthday is: " + myBirthday);

        // ------------------------------------------------------------------------------------------------------

        String stringDate = "2011-09-01";
        LocalDate stringDateValue = LocalDate.parse(stringDate); // stringDate is converted to stringDateValue

        System.out.println("String Date is: " + stringDate);
        System.out.println("String Date Value is: " + stringDateValue);

        // ------------------------------------------------------------------------------------------------------

        LocalDate kyalKyalBirthday = LocalDate.of(2001, 01, 01);
        LocalDate zawBirthday = LocalDate.of(1991, 01, 01);

        if(kyalKyalBirthday.isAfter(zawBirthday)) { // 2001-01-01 > 1991-01-01
            System.out.println("Kyal Kyal is younger");
        } else {
            System.out.println("Kyal Kyal is older");
        }
    }
}