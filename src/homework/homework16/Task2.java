package homework.homework16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        /**
         Ввести с клавиатуры 5 чисел и заполнить ими список.
         Вывести их в обратном порядке.
         Использовать только цикл for.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = integers.size() - 1; i >= 0 ; i--) {
            System.out.println(integers.get(i));
        }
    }
}
