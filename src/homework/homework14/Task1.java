package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        /**
         Создать список из чисел и заполнить его на 5 элементов с консоли
         Вывести все элементы списка в консоль
         */
        List<Integer> listOfInt = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            listOfInt.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (Integer integer : listOfInt) {
            System.out.print(integer + " ");
        }
    }

}
