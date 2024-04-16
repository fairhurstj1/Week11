public class Animal {
    private String name;
    private String location;
    private String color;

    Animal(){}
    Animal(String animalName, String animalLocation, String animalColor){
        name = animalName;
        location = animalLocation;
        color = animalColor;
    }

    //anim character

    public void displayAnimal(){
        System.out.println("Animal name: "+ this.name);
        System.out.println("Animal location: "+this.location);
        System.out.println("Animal color: "+this.color);
    }
}
