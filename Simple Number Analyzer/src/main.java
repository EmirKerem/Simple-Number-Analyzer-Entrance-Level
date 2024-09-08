import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Simple Number Analyzer");
        System.out.println("Please enter a number:");
        
        double number = scanner.nextDouble();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Your number is even.");
        } 
        else if (number % 2 == 1 || number % 2 == -1) {
            System.out.println("Your number is odd.");
        } 
        else {
            System.out.println("Error: Invalid input.");
        }
        
        // Factorial calculation
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else {
            long result = 1;
            for (int x = 1; x <= number; x++) {
                result *= x;
            }
            System.out.println("The factorial of " + number + " is " + Math.abs(result));
        }
        
        // Check if the number is positive or negative
        if (number == Math.abs(number) && number != 0) {
            System.out.println("Your number is positive.");
        } 
        else if (number != 0) {
            System.out.println("Your number is negative.");
        } 
        else {
            System.out.println("Your number is neutral (zero).");
        }
        
        // Find factors of the number
        if (number != 0) {
            System.out.println("The factors of your number are: ");
            for (int x = 1; x <= Math.abs(number); x++) {
                if (number % x == 0) {
                    System.out.println(x + " and " + (-x));
                }
            }
        } 
        else {
            System.out.println("Zero has infinite factors.");
        }

        // Check if the number is an integer or a decimal
        if (number == (int)number) {
            System.out.println(number + " is an integer.");
        } 
        else {
            System.out.println(number + " is a decimal number.");
        }
        
        // Check if the number is prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } 
        else if (number == 2) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } 
            else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}



