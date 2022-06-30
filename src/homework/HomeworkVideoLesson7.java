package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkVideoLesson7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

/**
 Ввести с клавиатуры два числа, вывести на экран максимальное из них.
 */
//        int num1 = Integer.parseInt(reader.readLine());
//        int num2 = Integer.parseInt(reader.readLine());
//
        //        if(num1 > num2) {
        //            System.out.println(num1);
        //        } else {
        //            System.out.println(num2);
        //        }

/**
 Ввести с клавиатуры три числа, вывести на экран минимальное из них.
 */
//        int num1 = Integer.parseInt(reader.readLine());
//        int num2 = Integer.parseInt(reader.readLine());
//        int num3 = Integer.parseInt(reader.readLine());
//
        //        if (num1 > num2 && num1 > num3) {
        //            System.out.println(num1);
        //        } else if (num1 < num2 && num2 > num3) {
        //            System.out.println(num2);
        //        } else {
        //            System.out.println(num3);
        //        }

/**
 Ввести с клавиатуры три числа, вывести на экран среднее из них.
 */
//        int num1 = Integer.parseInt(reader.readLine());
//        int num2 = Integer.parseInt(reader.readLine());
//        int num3 = Integer.parseInt(reader.readLine());
//
//           if (num1 > num2 && num1 < num3) {
//               System.out.println(num1);
//           } else if (num1 < num2 && num2 < num3) {
//               System.out.println(num2);
//           } else if (num1 < num3 && num2 > num3 ) {
//               System.out.println(num3);
//           }

        //4
        //      compare(3);

        /**
         Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
         Если число отрицательное, то увеличить его на 10. Вывести результат на экран.
         */
//        int enteredData = Integer.parseInt(reader.readLine());
//
//        if (enteredData > 0) {
//            System.out.println(enteredData * 2);
//        } else if (enteredData < 0) {
//            System.out.println(enteredData * 10);
//        }

        //5
        //   checkInterval(19);

        //6
        closeToFive(6, 4);
    }

    /**
     Реализовать метод compare(int a).
     Метод должен выводить строку на экран "Число меньше 5",
     если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр
     метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и.
     */
//    public static void compare(int a) {
//
//        if(a < 5) {
//            System.out.println("Число меньше 5");
//        } else if (a > 5) {
//            System.out.println("Число больше 5");
//        } else if (a == 5) {
//            System.out.println("Число равно 5");
//        }
//    }

    /**
     Реализовать метод checkInterval.
     Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить
     результат на экран в следующем виде: "Число а не содержится в интервале." или
     "Число а содержится в интервале.", где а - аргумент метода.
     */
//    public static void checkInterval(int a) {
//
//        if(a >= 20 && a <= 50){
//            System.out.println("Число a содержится в интервале.");
//        } else {
//            System.out.println("Число a не содержится в интервале.");
//        }
//    }

    /**
     * Реализовать метод closeToFive.
     * Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в
     * аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
     * Если оба числа на равной длине к 5, то вывести на экран любое из них.
     */
    public static void closeToFive(int a, int b) {
        if (Math.abs(a - 5) < Math.abs(b - 5)) {
            System.out.println(a);
        } else if (Math.abs(a - 5) > Math.abs(b - 5)) {
            System.out.println(b);
        } else if (Math.abs(a - 5) == Math.abs(b - 5)) {
            System.out.println(a);
            System.out.println(b);
        }
    }


}
