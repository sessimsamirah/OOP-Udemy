package AbstractClasses;

public class Bird extends Animal {
    public Bird(int age, String gender, String name) {
        super(age, gender, name);
    }

    @Override
    public void move() {
        System.out.println("Bird is flapping wings!");
    }
}