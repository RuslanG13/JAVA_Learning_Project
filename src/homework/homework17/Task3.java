package homework.homework17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
    /**
     Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
     */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrOfNum = new int[10];

        for (int i = 0; i < arrOfNum.length ; i++) {
            arrOfNum[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.stream(arrOfNum).sorted();

        for (int i = arrOfNum.length -1; i >= arrOfNum.length / 2; i--) {
            System.out.println(arrOfNum[i]);
        }
    }
}
