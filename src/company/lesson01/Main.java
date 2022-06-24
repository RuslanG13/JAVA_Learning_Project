package company.lesson01;

public class Main {


    public static void main(String[] args) {
        int a = 23;

        String str = "Hello";
        System.out.println(str);

        String str1 = "23";
        System.out.println(a + str1);

        int num = Integer.parseInt(str1);
        System.out.println(num);
        System.out.println( sum(2, 2));
        System.out.println(convert("Sam"));
        printTwoTimes("Garry");
    }

    private static int sum(int number1, int number2) {
        int res = number1 + number2;
        return res;
    }

    private static String convert(String str) {
        String res = str + " end.";
        return res;
    }

    public static void printTwoTimes(String str){
        System.out.println(str);
        System.out.println(str);
    }
 }
