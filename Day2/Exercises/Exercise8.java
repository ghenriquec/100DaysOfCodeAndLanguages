package Day2.Exercises;

import java.util.Scanner;

public class Exercise8 {
    int a;

    public void checkNumber() throws Exception {
        if (a < 0) {
            throw new Exception("Negative number");
        } else if (a == 0) {
            throw new Exception("Zero");
        } else {
            System.out.println("Positive number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise8 exercise8 = new Exercise8();
        System.out.println("Enter a number: ");
        exercise8.a = scanner.nextInt();
        try {
            exercise8.checkNumber();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
