package lessons.lesson15;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfSet {
    public static void main(String[] args) {
        System.out.println(getTimeOfInsert(fill(new ArrayList<>())));
        System.out.println(getTimeOfInsert(fill(new LinkedList<>())));

    }

    public static long getTimeOfInsert(List list) {
        Date startTime = new Date();
        insert10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }




    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

    private static List fill(List list) {
        for (int i = 0; i < 10000 ; i++) {
            list.add(new Object());
        }
        return list;
    }
}
