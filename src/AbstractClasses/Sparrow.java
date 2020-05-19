package AbstractClasses;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, String name) {
        super(age, gender, name);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high!");
    }
}