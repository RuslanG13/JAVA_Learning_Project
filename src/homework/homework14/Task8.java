package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) throws IOException {
        /**
         1. Создай список строк.
         2. Считай с клавиатуры 5 строк и добавь в список.
         3. Используя цикл, найди самую короткую строку в списке.
         4. Выведи найденную строку на экран.
         5. Если таких строк несколько, выведи каждую с новой строки.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            list.add(i, bufferedReader.readLine());
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        for (String s : list) {
            if (min == s.length()) {
                System.out.println(s);
            }
        }
    }
}
