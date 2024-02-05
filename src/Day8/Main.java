package Day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws CustomException {
        System.out.println("Exception Handling Challenges");
        Scanner sc = new Scanner(System.in);

        ///Challenge 1 - Array Index Out of Bounds.
        int[] num = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        try {
            int b = num[4];
            num[0] = b - num[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This always prints!");
            //sc.close();
        }
        try {
            //Challenge 2 - Number Format Exception.
            System.out.println("Enter a number: ");
            String strNumber = sc.nextLine();
            int intValue = Integer.parseInt(strNumber);
            System.out.println("Converted integer: " + intValue);
        } catch (NumberFormatException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            //sc.close();
        }
        //Challenge 3 - File Not Found Exception.
        try {
            File myObj = new File("ReadMe.txt");
            Scanner myReader = new Scanner(myObj);
            String data = myReader.nextLine();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            //sc.close();
        }
        //Challenge 4 - Custom Exception.
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (CustomException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            //sc.close();
        }
        //Challenge 5 - Null Pointer Exception.
        String str = null;
        try {
            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        //Challenge 6 - User Input Validation.
        int a = 0;
        do {

            try {
                System.out.print("Enter a positive Integer: ");
                a = sc.nextInt();
                System.out.println("Yay! You chose a positive Integer!");
            } catch (InputMismatchException e) {
                System.err.println("Exception caught: " + e.getMessage());
            } finally {
                // sc.close();
            }
        }
        while (a < 0);


        //Challenge 7 - Try-With-Resources.


        //Challenge 8 - Multiple Exceptions.

        try {
            System.out.print("Enter a numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter a denominator: ");
            int denominator = sc.nextInt();

            int result = performDivision(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
        //Challenge 9 - Unchecked Exception
        try{
            str = null;
            System.out.println("Trying to get the length of a null string: " + str.length());
        } catch(NullPointerException e){
            System.err.println("Error: Attempted to access a method or field on a null object.");
        }
    }

    private static int performDivision(int numerator, int denominator) {
        return numerator / denominator;
    }


    private static void checkAge(int age) throws CustomException {
        if (age < 17) {
            throw new CustomException("You must be 18+");
        } else {
            System.out.println("You're in!");
        }



}
}



