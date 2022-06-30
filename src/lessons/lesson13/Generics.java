package lessons.lesson13;

import lessons.lesson11.User;
import lessons.lesson13.examples.Example1;
import lessons.lesson13.examples.Example2;
import lessons.lesson13.model.BaseObject;
import lessons.lesson13.model.ChildObject;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();
        System.out.println("/-------------------------/");

        Example1<User> example1 = new Example1<>();
        System.out.println(example1.get());
        example1.set(new User("Alex", 30));
        System.out.println(example1.get());
        System.out.println("/-----------------------/");

        Example2.simpleInit(new User());

        Example2<User> example2 = Example2.init(new User());
        example2.setInstance(new User("Alex", 29));
        System.out.println(example2.getInstance());
        System.out.println("/---------------------------------------------/");

        List<BaseObject> list5 = new ArrayList<>();
        List<User> list6 = new ArrayList<>();
        List<ChildObject> list7 = new ArrayList<>();

        example1(list5);
        example1(list6);
        example1(list7);

//        example2(list5);
//        example2(list6);
//        example2(list7);
//
//        example3(list5);
//        example3(list6);
//        example3(list7);
        System.out.println("/--------------------------------------------/");

















    }

    public static void example1(List<?> list){

    }

    public static void example2(List<? extends User> list) {

    }

    public static void example3(List<? super User> list) {

    }


}
