package homework.homework17.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
         2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
         3. Вывести все объекты Human на экран.

         Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
         Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
         Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
         */

        Human Misha = new Human("son Artyom", true, 20);
        Human Kirill = new Human("son Elena", true, 18);
        Human Liza = new Human("daughter Elena", false, 16);

        Human father = new Human("batya Artyom", true, 50, Misha, Kirill, Liza);
        Human mother = new Human("mama Elena", false, 46, Misha, Kirill, Liza);

        Human grandFather1 = new Human("ded Anton", true, 71, father);
        Human grandMother1 = new Human("baba Maria", false, 73, father);

        Human grandFather2 = new Human("ded Andrey", true, 72, mother);
        Human grandMother2 = new Human("baba Anya", false, 70, mother);

        System.out.println(Misha.toString());
        System.out.println(Kirill.toString());
        System.out.println(Liza.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());


    }
}
