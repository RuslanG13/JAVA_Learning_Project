package lessons.lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("text");
        set.add("text1");
        set.add("text2");
        set.add("text3");


//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//           String s = iterator.next();
//            System.out.println(s);
//        }

        for (String s : set) {
            System.out.println(s);
        }
    }

}
