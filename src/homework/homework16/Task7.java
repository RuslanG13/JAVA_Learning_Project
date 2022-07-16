package homework.homework16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Task7 {
    public static void main(String[] args) {

/**
 Посчитать сколько дней прошло с начала года. Используйте класс LocalDate.
 */

        LocalDate startOfYear = LocalDate.of(2022, Month.JANUARY, 1);
        LocalDate nowData = LocalDate.now();

        System.out.println(startOfYear);
        System.out.println(nowData);

        System.out.println(ChronoUnit.DAYS.between(startOfYear, nowData) + 1);

    }
}
