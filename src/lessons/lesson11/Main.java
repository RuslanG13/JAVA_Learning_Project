package lessons.lesson11;

import lessons.lesson13.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex" , 23);
        User user1 = new User("Bob", 28);

        System.out.println(user.toString());
        System.out.println(user1.toString());

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

        System.out.println(user.equals(user1));
    }
}
