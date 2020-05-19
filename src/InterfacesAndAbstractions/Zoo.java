package InterfacesAndAbstractions;

public class Zoo {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow(8, "M", "Mad");
        sparrow.fly();

        Chicken chicken = new Chicken(3, "F", "Ana");
        chicken.eat();
        chicken.sleep();
    }
}