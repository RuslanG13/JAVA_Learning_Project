package homework.homework17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        /**
         1. Ввести с клавиатуры число N.
         2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
         3. Найти минимальное число среди элементов списка - метод getMinimum.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());


        List<Integer> listPartOfN;
        listPartOfN = getIntegerList(N);

        System.out.println(getMinimum(listPartOfN));


        //  System.out.println(getMinimum(getIntegerList(N)));

    }

    public static List<Integer> getIntegerList(int num) {
        String[] arrOfIntStr = String.valueOf(num).split("");
        int[] arrOfInt = new int[arrOfIntStr.length];

        for (int i = 0; i < arrOfIntStr.length; i++) {
            arrOfInt[i] = Integer.parseInt(arrOfIntStr[i]);
        }

        List<Integer> listOfInt = new ArrayList<>();

        for (Integer integer : arrOfInt) {
            listOfInt.add(integer);
        }

        return listOfInt;
    }

    public static int getMinimum(List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }
}
