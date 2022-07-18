package homework.homework17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        /**
         Создать коллекцию HashMap<String, String>, занести туда 4 пары строк
         Вывести содержимое коллекции на экран, каждый элемент с новой строки.
         Пример вывода:
         ключ - значение
         ключ - значение
         ключ - значение
         ключ - значение
         */

        Map<String, String> map = new HashMap<>();

        map.put("firstName", "Anton");
        map.put("lastName", "Sydorchuk");
        map.put("birthDay", "19 March 1993");
        map.put("birthPlace", "Odessa");

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry);
//        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
        }
    }
}
