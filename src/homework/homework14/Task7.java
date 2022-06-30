package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException {
        /**
         1. Создай список строк.
         2. Считай с клавиатуры 5 строк и добавь в список.
         3. Используя цикл, найди самую длинную строку в списке.
         4. Выведи найденную строку на экран.
         5. Если таких строк несколько, выведи каждую с новой строки.
         */

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        List<String> list = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            list.add(bufferedReader.readLine());
//        }

//        int largestString = list.get(0).length();
//        int index = 0;
//
//        for(int i = 0; i < list.size(); i++) {
//            if(list.get(i).length() > largestString) {
//                largestString = list.get(i).length();
//                index = i;
//            }
//        }
//        System.out.println(list.get(index));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList();
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length()>max) {
                max=list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (max==list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
