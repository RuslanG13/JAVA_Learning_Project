package homework.homework15;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        /** Буква «р» и буква «л»
         1. Создай список слов, заполни его самостоятельно.
         2. Метод fix должен:
         2.1. удалять из списка строк все слова, содержащие букву «р»
         2.2. удваивать все слова содержащие букву «л».
         2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
         2.4. с другими словами ничего не делать.

         Пример:
         лира
         лоза
         роза

         Выходные данные:
         лира
         лоза
         лоза
         */

        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("роза");
        listOfStrings.add("липа");
        listOfStrings.add("лира");
        listOfStrings.add("лоза");
        listOfStrings.add("ян");
        listOfStrings.add("роvа");
        listOfStrings.add("рола");

        listOfStrings = fix(listOfStrings);

        for (String s : listOfStrings) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> fixList = new ArrayList<>();

        for (String s : list) {
            if (s.contains("р") && s.contains("л")) {
                fixList.add(s);
            } else if (!s.contains("р") && s.contains("л")) {
                fixList.add(s);
                fixList.add(s);
            } else if (s.contains("р") && !s.contains("л")) {
                continue;
            } else {
                fixList.add(s);
            }
        }
        return fixList;
    }


}

