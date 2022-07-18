package lessons.lesson17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("text", 5);
        map.put("text", 7);
        map.put("text1", 7);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry);
//        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);
        }

    }

}
