package ClassAndObject;

public class Earth {
    public static void main(String[] args) {
        Human human1 = new Human("Tom", "brown", 156, 23);
        Human human2 = new Human("Jack", "blue", 45, 45);

        human1.speak();
        human2.speak();
    }
}