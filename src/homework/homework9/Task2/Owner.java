package homework.homework9.Task2;

/**
 1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
 2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
 3) В выполняющем методе создать по одному экземпляру каждого класса и
 сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
 */

public class Owner {

    private String name;
    private int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
