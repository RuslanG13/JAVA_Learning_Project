package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) throws IOException {
        /**
         1. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам:
         Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
         Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
         2. Создай метод printList - он должен выводить на экран все элементы списка с новой строки.
         3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
         */
//1
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> listX3 = new ArrayList<>();
        List<Integer> listX2 = new ArrayList<>();
        List<Integer> listLeftDigitsAfterDivide = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(i, Integer.parseInt(bufferedReader.readLine()));
        }

        for (Integer integer : list) {
            if (integer % 3 == 0) {
                listX3.add(integer);
            } else if (integer % 2 == 0) {
                listX2.add(integer);
            } else {
                listLeftDigitsAfterDivide.add(integer);
            }
        }
//3
        printList(listX3);
        printList(listX2);
        printList(listLeftDigitsAfterDivide);

    }

//2
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
