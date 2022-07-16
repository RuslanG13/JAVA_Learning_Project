package homework.homework15;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        /**
         Посчитать время работы метода remove в LinkedList и ArrayList
         */
        System.out.println(getTimeMsOfGet(fill(new ArrayList<>())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList<>())));

    }

    public static long getTimeMsOfGet(List list) {
        Date startDate = new Date();
        remove5000(list);
        Date endTime = new Date();

        long fin = endTime.getTime() - startDate.getTime();

        return fin;
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static void remove5000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        list.remove(x);
    }
}