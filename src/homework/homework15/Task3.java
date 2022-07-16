package homework.homework15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        /**
         1. Создай список строк.
         2. Добавь в него 5 строчек с клавиатуры.
         3. Удали последнюю строку и вставь её в начало. Повторить 5 раз.
         4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringsList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            stringsList.add(bufferedReader.readLine());
        }

        for (int i = 0; i < 5; i++) {
            String el = stringsList.remove(stringsList.size() - 1);
            stringsList.add(0, el);
        }

        for (String s : stringsList) {
            System.out.println(s);
        }
    }
}
