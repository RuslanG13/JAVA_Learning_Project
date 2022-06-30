package lessons.lesson02;

public class Main {


    public static void main(String[] args) {
        User user = new User();
        User.age = 28;
        user.name = "Ruslan";
        user.passData = "CV 14567";
        user.talk("str");
        System.out.println(user.name);

        User user1 = new User();
        User.age = 30;
        user1.name = "Ruslan1";
        user1.passData = "CV 14567";
        System.out.println(user1.name);

        System.out.println(User.age);

        User.m();
    }


}
