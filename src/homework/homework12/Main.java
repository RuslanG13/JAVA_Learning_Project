package homework.homework12;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        /**
         Задача по алгоритмам.
         Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
         Пример ввода:
         {1, 2, 3, 3, 4, 5,
         7, 5, 6, 2, 4, 7, 6}
         Пример вывода:
         1
         */

        int[] arrOfInt = new int[]{1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};

        System.out.println(getNotDublicateValue(arrOfInt));

        /**
         * Создать массив на 5 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
         * Вывести на экран максимальное и минимальное числа через пробел.
         */
        //Version1
        //      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //       int[] array = new int[5];

//        for (int i = 0; i < num.length ; i++) {
//            num[i] = Integer.parseInt(bufferedReader.readLine());
//        }
//
//        for (int i = 0; i < num.length ; i++) {
//            for (int j = 0; j < num.length-1 ; j++) {
//                if(num[j] > num[j + 1]) {
//                   int temp = num[j+1];
//                   num[j +1] = num[j];
//                   num[j] = temp;
//                }
//            }
//        }
//        System.out.println(num[0] + " " + num[num.length-1] );

        //Version2
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = Integer.parseInt(bufferedReader.readLine());
//            if(min > array[i]) {
//                min = array[i];
//            }
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        System.out.println(min + " " + max);
    }


    public static int getNotDublicateValue(int[] arr) {

        int curr = 0;

        for(int i:arr) {
            curr ^= i;
        }
       return curr;
    }

}




