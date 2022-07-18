package homework.homework17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
        /**
         Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
         При помощи метода printValues:
         Вывести на экран список значений, каждый элемент с новой строки.
         */

        Map<String, String> mapStr = new LinkedHashMap<>();

        mapStr.put("firstName", "Ruslan");
        mapStr.put("secondName", "Lyapkin");
        mapStr.put("birthPlace", "Kyiw");

        printValues(mapStr);

    }

    public static void printValues(Map<String, String> map) {
        for (String values : map.values()){
            System.out.println(values);
        }
    }
}
