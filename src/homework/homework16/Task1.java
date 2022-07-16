package homework.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        /**
         Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
         Программа выводит содержимое нового списка на экран.
         Пример ввода:
         Кот
         Коты
         Я
         Пример вывода:
         Кот Кот Кот
         Коты Коты
         Я Я Я
         */

        BufferedReader bufferedReader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        List<String> list = new ArrayList<>();
        List<String> res = new ArrayList<>();

        while (true) {
            String input = bufferedReader.readLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        for (String value : list) {
            if (value.length() % 2 == 0) {
                res.add(value + " " + value);
            } else {
                res.add(value + " " + value + " " + value);
            }
        }

        for (String s : res) {
            System.out.println(s);
        }
    }
}
