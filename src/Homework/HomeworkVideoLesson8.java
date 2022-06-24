package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeworkVideoLesson8 {

    public static void main(String[] args) throws IOException {
        /**
         Вывести на экран числа от 1 до 10 используя цикл while.
         */
//        int i = 10;
//        while (i > 0){
//            System.out.println(i);
//            i--;
//        }

        /**
         Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
         Через пробел либо с новой строки.
         */
//        for (int i = 2; i <= 100 ; i+= 2) {
//            System.out.println(i);
//        }

        /**
         Ввести с клавиатуры строку и число N.
         Вывести на экран строку N раз используя цикл while.
         Пример ввода:
         pro
         2
         Пример вывода:
         pro
         pro
         */
//       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String str = reader.readLine();
//        Integer N = Integer.parseInt(reader.readLine());
//
//        while (N>0) {
//            System.out.println(str);
//            N--;
//        }

        /**
         Ввести с клавиатуры два числа m и n.
         Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
         Пример: m=2, n=4
         8888
         8888
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer m = Integer.parseInt(reader.readLine());
        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }

        /**
         Вывести на экран квадрат 10х10 из букв P используя цикл while.
         */

//        int i = 0;
//        while (i < 10 ) {
//            int j = 0;
//            while (j < 10) {
//                System.out.print("P");
//                j++;
//            }
//            System.out.print("\n");
//            i++;
//        }

        /** Посчитать сумму чисел
         Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
         -1 должно учитываться в сумме.
         */
    //    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        int g = Integer.parseInt(reader.readLine());


        while (g != -1 || m != -1) {
            if (g == -1 || m == -1) {
                System.out.println(g + f);
                break;
            } else {
                System.out.println(g + f);
            }
            m = Integer.parseInt(reader.readLine());
            g = Integer.parseInt(reader.readLine());
        }
    }
}

