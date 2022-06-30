package homework;

/**
 * 1) Создать по одной переменной каждого типа данных, который ты знаешь.
 * 2) Присвоить каждой переменной значение в диапазоне типа.
 * 3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
 */

/**
 1) Создать три переменных (number1, number2, number3) типа int, присвоить им значение 10, 18, 21 соответственно.
 2) Не используя чисел, сделать так, чтобы значение у переменной number1 изменилось на 18
 2) Не используя чисел, сделать так, чтобы значение у переменной number2 изменилось на 21
 2) Не используя чисел, сделать так, чтобы значение у переменной number3 изменилось на 10
 3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
 */

public class HomeworkVideoLesson3 {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        boolean e = true;
        char f = 129;
        float g = 25.178F;
        double i = 30.24;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(i);
/////////////////////////////////////////////////////////////////////////////////
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;

        int temp = number1;
        number1 = number2;
        number2 = number3;
        number3 = temp;

        System.out.print(number1 + "\n" + number2 + "\n" + number3);
    }
}
