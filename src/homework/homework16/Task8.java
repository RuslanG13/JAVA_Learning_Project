package homework.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        /**
         Реверс числа
         1) Ввести число с клавиатуры
         2) Сделать реверс этого числа и вывести результат в консоль

         Пример:
         входные данные: -5544
         результат: -4455
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String num = bufferedReader.readLine();

        String[] arr = num.split("");

        for (int i = 0; i < arr.length / 2 ; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        String reverseArrToStr = String.join("", arr);
        int reverseNum = Integer.parseInt(reverseArrToStr);

        System.out.println(reverseNum);

    }
}
