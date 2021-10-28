package exercise_2;

//although a 'Mammal' is an animal, hair length is a specific character trait belonging to this family of animals

public class Mammal extends Animal {
    double hairLength;

    public Mammal(String species, int age, boolean warmblooded, double hairLength) {
        super(species, age, warmblooded);
        this.hairLength = hairLength;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", warmblooded=" + warmblooded +
                ", hairLength=" + hairLength +
                '}';
    }
}
