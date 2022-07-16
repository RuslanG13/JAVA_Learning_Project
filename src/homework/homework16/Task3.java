package homework.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        /**
         Ввести с клавиатуры 2 числа N  и M.
         Ввести N строк и заполнить ими список.
         Переставить M первых строк в конец списка.
         Вывести список на экран, каждое значение с новой строки.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            list.add(bufferedReader.readLine());
        }

        for (int i = 0; i < M; i++) {
            list.add(list.remove(0));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}

