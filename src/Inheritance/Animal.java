package Inheritance;

public class Animal {
    String name;
    String gender;
    int age;

    public Animal(int age, String gender, String name) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Eating!");
    }

    public void sleep() {
        System.out.println("Sleeping!");
    }
}