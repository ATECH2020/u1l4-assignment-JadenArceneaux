import java.util.Scanner;
import java.lang.Math;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        int hourDif = hours2 - hours1;
        int minutesDif = minutes2 - minutes1;
        int secondsDif = seconds2 - seconds1;

        int totalSeconds = (hourDif * 3600) + (minutesDif * 60) + (secondsDif);

        System.out.print(totalSeconds);


        // closing the scanner object
        scanner.close();
    }
}