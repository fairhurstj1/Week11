public class Giraffe extends Animal{

    private String spotColors;

    public Giraffe(String name, String location, String color, String giraffeSpotColors){
        super(name, location, color);
        spotColors = giraffeSpotColors;
    }
    public void setSpotColors(String animalSpotColor){
        spotColors = animalSpotColor;
    }

    public String getSpotColors(){
        return spotColors;
    }
@Override

    public void displayAnimal(){
        super.displayAnimal();
        System.out.println("Spot colors: "+spotColors);
    }

}
