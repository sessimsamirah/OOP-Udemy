package Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(10, "F", "Bobby");
        animal.eat();

        Bird bird1 = new Bird(4, "M", "Cardinal");
        bird1.eat();
        bird1.sleep();
        bird1.fly();

        Fish fish1 = new Fish(2, "F", "Gold-Fish");
        fish1.eat();
        fish1.swim();
    }
}