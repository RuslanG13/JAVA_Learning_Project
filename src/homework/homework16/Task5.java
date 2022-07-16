package homework.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IOException {
        /**
         Создать список строк.
         Ввести строки с клавиатуры и добавить их в список.
         Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
         Вывести строки на экран, каждую с новой строки.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String str = bufferedReader.readLine();

            if (str.equals("end")) {
                break;
            }

            list.add(str);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
