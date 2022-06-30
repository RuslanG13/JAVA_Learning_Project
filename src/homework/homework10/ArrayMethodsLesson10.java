package homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 * Найти минимальный элемент в массиве и вывести его в консоль.
 * <p>
 * 1. В методе initializeArray():
 * 1.1. Создайте массив на 10 чисел
 * 1.2. Считайте с консоли 10 чисел и заполните ими массив
 * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 * 3. В выполняющем методе main выведите максимальное число в консоль
 */

public class ArrayMethodsLesson10 {

    public static void initializeArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
