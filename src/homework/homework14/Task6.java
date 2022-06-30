package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {
        /**
         Создать список чисел и заполнить его с консоли
         Разбить список на два других:
         - в первый список сохранять чётные числа
         - во второй список сохранять нечётные числа
         Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();


        String value = bufferedReader.readLine();


        while (!value.equals("")) {
            list.add(Integer.parseInt(value));

            value = bufferedReader.readLine();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                listEven.add(list.get(i));
            } else if (list.get(i) % 2 != 0) {
                listOdd.add(list.get(i));
            }
        }
        System.out.print(list + "\n");
        System.out.print(listOdd + "\n");
        System.out.print(listEven);


    }
}
