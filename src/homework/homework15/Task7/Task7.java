package homework.homework15.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException {
        /**
         * Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
         * Создать класс Cat с параметрами name, age, weight, tail;
         * Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
         * "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
         * Вводить параметры с клавиатуры и создавать объект с введенными параметрами.
         * Ввод продолжается, пока переменная с именем не пуста.
         * Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
         * Пример:
         * Cat name is Barsik, age is 6, weight is 5, tail = 22
         * Cat name is Murka, age is 8, weight is 7, tail = 20
         */

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        List<String> catList = new ArrayList<>();
//
//        Cat cat = new Cat(bufferedReader.readLine(),Integer.parseInt(bufferedReader.readLine()), Integer.parseInt(bufferedReader.readLine()), Integer.parseInt(bufferedReader.readLine()) );
//
//        System.out.println(cat.toString());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Object> listCat = new ArrayList<>();

        while (true) {
            String name = bufferedReader.readLine();
            if (name.isEmpty()) {
                break;
            }
            int age = Integer.parseInt(bufferedReader.readLine());
            int weight = Integer.parseInt(bufferedReader.readLine());
            int tailLength = Integer.parseInt(bufferedReader.readLine());
            Cat cat = new Cat(name, age, weight, tailLength);
            listCat.add(cat);
        }

        for (Object s : listCat) {
            System.out.println(s);
        }
    }
}
