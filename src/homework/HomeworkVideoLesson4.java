package homework;

/**
 * 1) Создать метод sum, который должен суммировать 2 числа.
 * 1) Создать метод multy, который должен умножить 2 числа.
 * 1) Создать метод subt, который должен вычесть второе число из первого.
 * 1) Создать метод div, который должен делить 2 числа.
 */

/**
 1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
 2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
 3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
 */

public class HomeworkVideoLesson4 {

    public static void main(String[] args) {
        System.out.println(sum(10, 5));
        System.out.println(multy(10, 5));
        System.out.println(div(10, 7));
        System.out.println(subt(10, 7));

        System.out.println(convert(100));
        System.out.println(percent(1000));

        returnStringFourTimes("Java the best");

    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static int multy(int num1, int num2) {
        return num1 * num2;
    }

    private static int subt(int num1, int num2) {
        return num1 - num2;
    }

    private static double div(int num1, int num2) {
        return Math.round((num1 * 1.0 / num2) * 100.0) / 100.0;
    }

    private static double convert(int evro) {
        double equalsTax = 1.04;
        double euroToDollar = evro * equalsTax;
        return euroToDollar;
    }

    private static double percent(int num) {
        int percentFromNumber = (num * 10) / 100;
        double sum = num + percentFromNumber;
        return sum;
    }

    private static void returnStringFourTimes(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}
