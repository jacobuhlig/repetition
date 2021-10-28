package exercise_2;

//generally speaking an animal belongs to a species, has an age, and is either warm - or coldblooded
//this, however, is about all the generalization we can make about animals, due to them being rather different in other ways
//therefore the 'Animal' class has been extended to the subclasses of 'Mammal' and 'Amphibian'

public class Animal {
    String species;
    int age;
    boolean warmblooded;

    public Animal(String species, int age, boolean warmblooded) {
        this.species = species;
        this.age = age;
        this.warmblooded = warmOrColdBlooded;
    }

    public void run() {
        System.out.println("The " + this.species + " is running");
    }
}
