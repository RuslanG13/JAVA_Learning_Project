package Homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Ввести с клавиатуры число n.
 Вывести на экран надпись «Я зарабатываю $n в час».
 Пример:
 Я буду зарабатывать $50 в час
 */

/**
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример:
Alex будет получать 4000 через 5 лет.
*/

public class HomeworkVideoLesson6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       // String amountOfSalary = bufferedReader.readLine();
       // System.out.println("Я буду зарабатывать $" + amountOfSalary + " в месяц" );

        String name = bufferedReader.readLine();
        int amoutOfMoney = Integer.parseInt(bufferedReader.readLine());
        double futureSalary = Double.parseDouble(bufferedReader.readLine());

        System.out.println(name +  " будет получать " + amoutOfMoney + "$ через " + futureSalary + " лет.");

    }





}
