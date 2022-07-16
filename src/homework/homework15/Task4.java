package homework.homework15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        /**
         Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> listOfStrings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listOfStrings.add(bufferedReader.readLine());
        }

        listOfStrings.remove(listOfStrings.size() / 2);

        for (int i = listOfStrings.size() - 1; i >= 0; i--) {
            System.out.println(listOfStrings.get(i));
        }
    }
}
