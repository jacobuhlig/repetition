package exercise_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //initialization of objects of the subclasses
        Amphibian frog = new Amphibian("Blue poison dart frog", 3, false, 2);
        Amphibian salamander = new Amphibian("Eastern hellbender", 2, false, 1);

        Mammal hamster = new Mammal("Genus Cricetulus", 4, true, 0.2);
        Mammal human = new Mammal("Homo Sapiens", 40, true, 2);

        //adding the objects of the different subclasses to an array of type 'Animal'
        //this shows that the objects are considered to by of overall type 'Animal'
        //(otherwise they couldn't be added to the array)
        Animal[] amphibiansAndMammals = {frog, salamander, hamster, human};

        System.out.println(Arrays.toString(amphibiansAndMammals));

        //They can also both use utilize a method derived from Animal
        frog.run(); //amphibian
        hamster.run(); //mammal


    }
}
