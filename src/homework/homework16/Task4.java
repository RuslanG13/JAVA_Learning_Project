package homework.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {

        /**
         Создать массив на 5 чисел.
         Заполнить его числами с клавиатуры.
         Найти максимальное и минимальное числа в массиве.
         Вывести на экран максимальное и минимальное числа через пробел.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }

        for (int j : intArray) {
            if (min > j) {
                min = j;
            }
        }

        System.out.print(max + " " + min);
    }
}
