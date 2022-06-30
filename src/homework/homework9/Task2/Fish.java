package homework.homework9.Task2;

/**
 1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
 2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
 3) В выполняющем методе создать по одному экземпляру каждого класса и
 сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
 */

public class Fish {

    private String name;
    private double age;
    private String owner;

    public Fish(String name, double age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }
}
