package homework.homework17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) throws IOException {
        /**
         Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> strList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strList.add(bufferedReader.readLine());
        }

        List<String> sortedAlphabeticalList = strList.stream().sorted().collect(Collectors.toList());

        for (String s : sortedAlphabeticalList) {
            System.out.println(s);
        }

    }
}
