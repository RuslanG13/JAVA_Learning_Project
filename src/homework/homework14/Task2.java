package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        /**
         1. Создай список строк.
         2. Добавь в него 5 различных строчек с консоли.
         3. Выведи его размер на экран.
         4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> listOfStrings = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            listOfStrings.add(bufferedReader.readLine());
        }
        System.out.println(listOfStrings.size());

        for (String listOfString : listOfStrings) {
            System.out.println(listOfString);
        }
    }
}
