package lessons.lesson15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(2007, Month.APRIL, 20);
        System.out.println(localDate1);
    }
}


