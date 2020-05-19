package Inheritance;

public class Bird extends Animal{
    public Bird(int age, String gender, String name) {
        super(age, gender, name);
    }

    public void fly() {
        System.out.println("Bird flying!");
    }
}
