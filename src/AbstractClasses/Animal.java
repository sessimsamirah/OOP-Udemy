package AbstractClasses;

public abstract class Animal {

    String name;
    String gender;
    int age;

    public Animal(int age, String gender, String name) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public abstract void move();
}