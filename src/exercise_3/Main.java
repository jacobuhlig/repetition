package exercise_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File exercise3Text = new File("exercise-3/2021-10-28_exercise-3_text-file.rtf");
        Scanner scanExercise3Text = new Scanner(exercise3Text);
        int count = 0;
        while(scanExercise3Text.hasNextLine()) {
            String line = scanExercise3Text.nextLine();
            String[] stringArray = line.split(" ");
            count += stringArray.length;
        }
        System.out.println(count);
    }
}
