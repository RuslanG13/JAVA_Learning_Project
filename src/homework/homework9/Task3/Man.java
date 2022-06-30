package homework.homework9.Task3;

/**
 1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
 2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
 3) В выполняющем методе создать по одному экземпляру каждого класса и
 сделать так, чтобы объекты стали мужем и женой.
 */

public class Man {

    private String name;
    private int age;
    private String wife;

    public Man(String name, int age, String wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWife() {
        return wife;
    }
}
