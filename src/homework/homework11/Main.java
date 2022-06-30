package homework.homework11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
         * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
         * Примечание:
         * Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
         * Пример вывода:
         * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
         * Имя: Катя, пол: женский, возраст: 55
         * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
         * …
         */

        Human granny1 = new Human("Anastasia", "Female", 70);
        Human grandFather1 = new Human("Gleb", "Male", 73);

        Human granny2 = new Human("Antonina", "Female", 69);
        Human grandFather2 = new Human("Griroryi", "Male", 74);

        Human mother = new Human("Veronika", "Female", 45, grandFather1, granny1);
        Human father = new Human("Nikolai", "Male", 48, grandFather2, granny2);

        Human boy = new Human("Ivan", "Male", 23, father, mother);
        Human girl = new Human("Katya", "Female", 22, father, mother);

//        System.out.println(granny1.toString());
//        System.out.println(grandFather1.toString());
//        System.out.println(granny2.toString());
//        System.out.println(grandFather2.toString());
//        System.out.println(father.toString());
//        System.out.println(mother.toString());
//        System.out.println(girl.toString());
//        System.out.println(boy.toString());

        /**
         В методе initializeArray():
         1. Создать массив на 10 строчек.
         2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
         В методе printArray():
         3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
         */

//        ArraysMethods.initializeArray();
//        ArraysMethods.printArray();

        /**
         1. Создать массив на 5 строк.
         2. Создать массив на 5 чисел.
         3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
         4. В каждую ячейку массива чисел записать длину строки из массива строк,
         индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
         Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
         */
//Version 1
//        ArraysMethods.fiiStrArr();
//        System.out.println(Arrays.toString(ArraysMethods.fillIntArrIndexOfStrArr()));
//Version 2

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] arrOfStr = new String[5];
//        int[] arrOfInt = new int[5];
//
//        for (int i = 0; i < arrOfStr.length ; i++) {
//            arrOfStr[i] = bufferedReader.readLine();
//        }
//
//        for (int i = 0; i < arrOfStr.length ; i++) {
//            for (int j = 0; j < arrOfInt.length ; j++) {
//                arrOfInt[j] = arrOfStr[j].length();
//            }
//        }
//        System.out.println(Arrays.toString(arrOfInt));
//        bufferedReader.close();

        /**
         1. Создать массив на 10 чисел.
         2. Ввести в него значения с клавиатуры.
         3. Создать два массива на 5 чисел каждый.
         4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
         5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrBig = new int[10];
        int[] arrSmall1 = new int[5];
        int[] arrSmall2 = new int[5];

        for (int i = 0; i < arrBig.length; i++) {
            arrBig[i] = Integer.parseInt(bufferedReader.readLine());
        }
//Version 1
//        for (int i = 0; i < arrSmall1.length ; i++) {
//            arrSmall1[i] = arrBig[i];
//            arrSmall2[i] = arrBig[i + 5];
//        }
//        System.out.println(Arrays.toString(arrSmall2));
//Version2
        arrSmall1 = Arrays.copyOfRange(arrBig, 0 , 5);
        arrSmall2 = Arrays.copyOfRange(arrBig, 5, 10);

        System.out.println(Arrays.toString(arrSmall1));
        System.out.println(Arrays.toString(arrSmall2));

        for (int i = 0; i < arrSmall2.length ; i++) {
            System.out.println(arrSmall2[i]);
        }
    }

}




