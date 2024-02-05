package Lesson05_02_2024;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);


        LocalTime time = LocalTime.now();
        System.out.println(time);


        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedDate = dateTimeFormatter.format(dateTime);
        System.out.println(formattedDate);
    }
}
