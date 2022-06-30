package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IOException {
        /**
         Создать список чисел и заполнить его с консоли
         Удалить все числа больше 5
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        String valueFromConsole = bufferedReader.readLine();

      while (!valueFromConsole.equals("")) {
          list.add(Integer.parseInt(valueFromConsole));
          valueFromConsole = bufferedReader.readLine();
      }

        for (int i = list.size()-1; i > 0; i--) {
            if (list.get(i) > 5) {
                list.remove(i);
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
