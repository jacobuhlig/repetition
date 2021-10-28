package exercise_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        //adds the numbers 1 to 100 to the ArrayList
        for (int i = 1; i < 101; i++) {
            numbers.add(i);
        }

        //prints the values vertically using a for-each loop
        for (int num : numbers ) {
            System.out.println(num);
        }

        int numberToRemoveAllMultipliers = scan.nextInt();
        int amountOfTimesNumberMultiplies = 100 / numberToRemoveAllMultipliers;

        ArrayList<Integer> multipliedNumbers = new ArrayList<>();

        for (int i = 1; i < amountOfTimesNumberMultiplies; i++) {
            int specificNumber = numberToRemoveAllMultipliers * (i + 1);
            multipliedNumbers.add(specificNumber);
        }


        int length = multipliedNumbers.size();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if(multipliedNumbers.get(i).equals(numbers.get(j))) {
                    numbers.remove(j);
                }
            }
        }

        for (int num : numbers ) {
            System.out.println(num);
        }
    }
}
