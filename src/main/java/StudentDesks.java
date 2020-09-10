import java.util.Scanner;
import java.lang.Math;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        double class1 = Math.round(scanner.nextDouble() / 2);
        double class2 = Math.round(scanner.nextDouble() / 2);
        double class3 = Math.round(scanner.nextDouble() / 2);
        
        int answer = (int) (class1 + class2 + class3);
        System.out.print(answer);

        scanner.close();
    }
}