package Inheritance;

public class Fish extends Animal{
    public Fish(int age, String gender, String name) {
        super(age, gender, name);
    }

    public void swim() {
        System.out.println("Fish swimming!");
    }
}
