package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class FormatDates    {

    public static void main(String[] args) {

        // Get current local date/time
        LocalDateTime now = LocalDateTime.now();

        // Creating formater 1
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(format1));

        // Creating formater 2
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(format2));

        //Creating formater 3
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        System.out.println(now.format(format3));

        // GMT Time
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(gmtTime.format(format4));

        // Bonus
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");
        System.out.println(now.format(format5));
    }
}