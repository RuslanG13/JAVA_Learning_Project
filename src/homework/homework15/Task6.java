package homework.homework15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) throws IOException {
        /**
         1. Введи с клавиатуры 5 слов в список строк.
         2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
         3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

         Пример:
         краб
         лось
         рак

         Выходные данные:
         краб краб
         лось лось
         рак рак
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            listStr.add(bufferedReader.readLine());
        }

        listStr = doubleValues(listStr);

        for (String s : listStr) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> fixedList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            fixedList.add(list.get(i) + " " + list.get(i));
        }
        return fixedList;
    }
}
