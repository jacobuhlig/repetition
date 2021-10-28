package exercise_4;

public class Main {
    static int currentUSPopulation = 331002651;

    public static double numberOfOccurrencesDuringSpecifiedPeriod(int intervalInSeconds, int periodInYears) {
        //60(seconds) * 60(minutes) * 24(hours) * 265.24(days)
        double secondsInAYear = 60 * 60 * 24 * 365.24;

        return (secondsInAYear * (double) periodInYears) / intervalInSeconds;
    }

    public static int projectedPopulation(int births, int deaths) {
        return (currentUSPopulation + births) - deaths;
    }

    public static double growthInPercentile(int projectedPopulationInFiveYears) {
        return (((double) projectedPopulationInFiveYears / (double) currentUSPopulation) - 1) * 100;
    }

    public static void main(String[] args) {
        int numberOfBirthsDuringFiveYears = (int) numberOfOccurrencesDuringSpecifiedPeriod(7, 5);
        int numberOfDeathsDuringFiveYears = (int) numberOfOccurrencesDuringSpecifiedPeriod(13, 5);

        int projectedPopulationInFiveYears = projectedPopulation(numberOfBirthsDuringFiveYears, numberOfDeathsDuringFiveYears);
        System.out.println("Current U.S. population: " + currentUSPopulation);
        System.out.println("Projected U.S. population in five years: " + projectedPopulationInFiveYears);

        double percentageGrowth = growthInPercentile(projectedPopulationInFiveYears);

        System.out.printf("That's a growth of %.2f%s", percentageGrowth, "%");
    }
}
