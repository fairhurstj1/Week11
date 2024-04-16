public class Zoo {
    public static void main(String[] args) {
        System.out.println("Welcome to the best zoo in the world!\n");

        Animal mascot = new Animal("Blue Demon", "Everywhere", "Blue and Gold");
        mascot.displayAnimal();
        System.out.println();
        Zebra xray = new Zebra("Xray", "Waterfall", "White");
        xray.displayAnimal();
        System.out.println();
        Giraffe g = new Giraffe("Jeff", "The Big Room", "Yellow", "Blue");
        g.displayAnimal();
    }
}
