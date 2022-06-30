package homework.homework10;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        /**
         Создать и заполнить массив из 10 чисел, значениями от 1 до 10
         */
//        int[] arr1 = new int[10];
//        for (int i = 0; i < arr1.length ; i++) {
//            arr1[i] = i + 1;
//            System.out.println(arr1[i]);
//        }

        /**
         Создать и заполнить массив из 10 чисел, значениями от 10 до 1
         */
//        int[] arr2 = new int[10];
//        for (int i = 0; i < arr2.length ; i++) {
//            arr2[i] = 10 - i;
//            System.out.println(arr2[i]);
//        }

        /**
         Создать и заполнить массив из 10 чисел, значениями от 10 до 19
         */
//        int[] arr3 = new int[10];
//        for (int i = 0; i < arr3.length ; i++) {
//            arr3[i] = 10 + i;
//            System.out.println(arr3[i]);
//        }

        /**
         Создать и заполнить массив из 10 чисел, значениями от 29 до 20
         */
//        int[] arr4 = new int[10];
//        for (int i = 0; i < arr4.length ; i++) {
//            arr4[i] = 29 - i;
//            System.out.println(arr4[i]);
//        }

        /**
         Ввести 5 строк с клавиатуры и записать их в массив
         */

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] arr5 = new String[5];
//
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = bufferedReader.readLine();
//        }
//
//        for (int j = 0; j < arr5.length ; j++) {
//            System.out.print(arr5[j]);
//        }

        /**
         Ввести 5 чисел с клавиатуры и записать их в массив
         Вывести содержимое массива в консоль
         */
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr6 = new int[5];
//
//        for (int i = 0; i < arr6.length; i++) {
//            arr6[i] = Integer.parseInt(bufferedReader.readLine());
//        }
//
//        for (int j = 0; j < arr6.length ; j++) {
//            System.out.println(arr6[j]);
//        }

        /**
         Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
         Посчитать сумму элементов массива и вывести её на экран.
         */
//        int[] arr7 = new int[]{1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < arr7.length; i++) {
//          sum+= arr7[i];
//        }
//        System.out.println(sum);

        /**
         * Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
         * Найти минимальный элемент в массиве и вывести его в консоль.
         * <p>
         * 1. В методе initializeArray():
         * 1.1. Создайте массив на 10 чисел
         * 1.2. Считайте с консоли 10 чисел и заполните ими массив
         * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
         * 3. В выполняющем методе main выведите максимальное число в консоль
         */

//        int[] arr8 = new int[]{15, 13, 16, 18, 20};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr8.length ; i++) {
//            if(arr8[i]< min) {
//               min = arr8[i];
//            }
//        }
//        System.out.println(min);

        //   ArrayMethodsLesson10.initializeArray();

//        System.out.println(ArrayMethodsLesson10.max( new int[]{2, 4, 6, 15, 10, 11}));

        /**
         Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
         Пример:
         8
         88
         888
         ...
         */
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

