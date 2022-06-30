package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) throws IOException {
        /**
         Создать список из целых чисел и заполнить его с консоли
         Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
         После того, как ввод завершён - вывести все элементы списка в консоль
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listOfInteger = new ArrayList<>();
        String s = reader.readLine();

        while (!s.equals("")) {
            listOfInteger.add(Integer.parseInt(s));

            s = reader.readLine();
        }

        for (Integer integer : listOfInteger) {
            System.out.println(integer);
        }
    }



}
