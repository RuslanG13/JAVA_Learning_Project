package lessons.lesson08;
// for while do/while

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        int i = 10;
//        while (i < 10) {
//            System.out.println("text " + i);
//            i++;
//        }
//
//        int j = 10;
//        do {
//            System.out.println("text " + j);
//            j++;
//        }while (j < 10);
//
//
//    }

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String str = bufferedReader.readLine();
//
//        while (!str.equals("exit")) {
//            System.out.println(str);
//            str = bufferedReader.readLine();
//        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                System.out.println("inner text " + j);
//            }
//        }
//        System.out.println("End");

        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 5) {
                System.out.println("inner " + j);
                j++;
            }
            System.out.println("text " + i);
            i++;
        }
    }

}
