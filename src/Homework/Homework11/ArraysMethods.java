package Homework.Homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysMethods {
    /**
     * В методе initializeArray():
     * 1. Создать массив на 10 строчек.
     * 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
     * В методе printArray():
     * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
     */

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static String[] arr = new String[10];

    public static void initializeArray() throws IOException {
        for (int i = 0; i < 8; i++) {
            arr[i] = bufferedReader.readLine();
        }

    }

    public static void printArray() throws IOException {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 1. Создать массив на 5 строк.
     * 2. Создать массив на 5 чисел.
     * 3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
     * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
     * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
     * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
     */

   private static String[] arrOfStr = new String[5];
   private static int[] arrOfInt = new int[5];

    public static void fiiStrArr() throws IOException {
        for (int i = 0; i < arrOfStr.length; i++) {
            arrOfStr[i] = bufferedReader.readLine();
        }
    }

    public static int[] fillIntArrIndexOfStrArr() {
        for (int i = 0; i < arrOfStr.length ; i++) {
            for (int j = 0; j < arrOfInt.length ; j++) {
                arrOfInt[j] = arrOfStr[j].length();
            }
        }
        return arrOfInt;
    }

}

