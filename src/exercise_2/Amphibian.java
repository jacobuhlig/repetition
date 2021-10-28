package exercise_2;

//the same idea of a specific character trait belonging to amphibians is the case with the number of defensive glans

public class Amphibian extends Animal {
    int numberOfDefensiveSkinGlans;

    public Amphibian(String species, int age, boolean warmblooded, int numberOfDefensiveSkinGlans) {
        super(species, age, warmblooded);
        this.numberOfDefensiveSkinGlans = numberOfDefensiveSkinGlans;
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "numberOfDefensiveSkinGlans=" + numberOfDefensiveSkinGlans +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", warmblooded=" + warmblooded +
                '}';
    }
}
