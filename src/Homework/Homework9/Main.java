package Homework.Homework9;

import Homework.Homework9.Task1.Robot;
import Homework.Homework9.Task2.Cat;
import Homework.Homework9.Task2.Dog;
import Homework.Homework9.Task2.Fish;
import Homework.Homework9.Task2.Owner;
import Homework.Homework9.Task3.Man;
import Homework.Homework9.Task3.Woman;


public class Main {

    public static void main(String[] args) {
//Task1
        Robot robot1 = new Robot("VacuumRobot1", 2, 10);
        Robot robot2 = new Robot("VacuumRobot2", 3, 15);

        System.out.println(robot1.fight(robot2));

//Task2
        Owner owner = new Owner("Sara Conor", 32);
        Cat cat = new Cat("Felix", 2.0, new Owner("Sara Conor").getName());
        Dog dog = new Dog("Sharik", 1.5, new Owner("Sara Conor").getName());
        Fish fish = new Fish("Nemo", 0.5, new Owner("Sara Conor").getName());

        System.out.println(cat.getOwner());
        System.out.println(dog.getOwner());
        System.out.println(fish.getOwner());

//Task3
        Woman woman = new Woman("Annet", 27, new Man("Dorrian").getName());
        Man man = new Man("Dorrian", 30, new Woman("Annet").getName());

        System.out.println(woman.getHusband() + " and " + man.getWife() + " are married");
    }
}
