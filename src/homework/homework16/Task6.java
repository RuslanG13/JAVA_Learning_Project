package homework.homework16;

import java.text.ParseException;

import java.util.Date;



public class Task6 {
    public static void main(String[] args) throws ParseException {
        /**
         Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.
         */

        Date date = new Date();
        Date date1 = new Date(122, 6, 17, 0, 0);

        System.out.println(date);
        System.out.println(date1);
        long diff = date.getTime() - date1.getTime();


        int diff2 = ((int)diff / 1000) / 60;

        System.out.println(diff2);



    }
}
