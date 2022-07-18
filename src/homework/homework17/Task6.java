package homework.homework17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        /**
         Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
         При помощи метода printKeys:
         Вывести на экран список ключей, каждый элемент с новой строки.
         */

        Map<String, String> mapStr = new HashMap<>();

        mapStr.put("firstName", "Ruslan");
        mapStr.put("secondName", "Lyapkin");
        mapStr.put("birthPlace", "Kyiw");

        printKeys(mapStr);

    }

    public static void printKeys(Map<String, String> map) {
        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String keys = iterator.next();
            System.out.println(keys);
        }
    }
}
