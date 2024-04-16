public class Zebra extends Animal{

    private String stripeColors;

    public Zebra(String name, String color, String stripes){
        super(name, color, stripes);
        stripeColors = stripes;
    }
    public void setStripes(String animalStripeColor){
        stripeColors = animalStripeColor;
    }

    public String getStripes(){
        return stripeColors;
    }

    @Override

    public void displayAnimal(){
        super.displayAnimal();
        System.out.println("Stripe colors: "+stripeColors);
    }

}
