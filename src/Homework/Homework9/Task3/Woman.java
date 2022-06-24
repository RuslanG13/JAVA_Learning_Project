package Homework.Homework9.Task3;

/**
 1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
 2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
 3) В выполняющем методе создать по одному экземпляру каждого класса и
 сделать так, чтобы объекты стали мужем и женой.
 */

public class Woman {

    private String name;
    private int age;
    private String husband;

    public Woman(String name, int age, String husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    public Woman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHusband() {
        return husband;
    }
}
