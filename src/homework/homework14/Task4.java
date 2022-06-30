package homework.homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    /**
     * Создать список чисел и заполнить его с консоли следующим образом:
     * чётные числа добавляют в конец списка, нечётные — в начало.
     */

    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new LinkedList<>();


        for (int i = 0; i < 4 ; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            if( a % 2 != 0) {
                list.add(0, a);
            } else if (a % 2 == 0) {
                list.add(a);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
