package homework.homework17.Task2;

import java.util.ArrayList;

public  class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human>children = new ArrayList();

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human child1) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.add(child1);
    }

    public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.add(child1);
        this.children.add(child2);
        this.children.add(child3);
    }


    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        int childCount = this.children.size();
        if (childCount > 0) {
            text += ", дети: " + this.children.get(0).name;

            for (int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text += ", " + child.name;
            }
        }
        return text;
    }
}
