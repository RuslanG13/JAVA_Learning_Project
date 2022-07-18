package homework.homework17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) throws IOException {
        /**
         Удалить все числа больше 10:
         Создать множество чисел(Set<Integer>), занести туда 5 различных чисел.
         При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> setOfInt = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            setOfInt.add(Integer.parseInt(bufferedReader.readLine()));
        }

        removeAllNumbersMoreThan10(setOfInt);

        System.out.println(setOfInt);
    }

    public static void removeAllNumbersMoreThan10(Set<Integer> set) {
        set.removeIf(num -> num > 10);
    }
}
