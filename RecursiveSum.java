import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that calculates the sum of five numbers entered by the user using recursion.
 */
public class RecursiveSum {

    public static void main(String[] args) {
        // Initialize scanner and array for user input
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get user input
        getInput(scanner, numbers);

        // Calculate the sum using recursion
        int totalSum = sumNumbers(numbers, 0);
        System.out.println("The sum of the five numbers is: " + totalSum);

        // Close scanner resource
        scanner.close();
    }

    /**
     * Prompts the user to enter five numbers and fills the array.
     * Validates that the input is a number and throws an exception for invalid input.
     *
     * @param scanner Scanner object for user input
     * @param numbers Array to store the input numbers
     */
    public static void getInput(Scanner scanner, int[] numbers) {
        System.out.println("Please enter five numbers:");
        
        for (int i = 0; i < numbers.length; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter number " + (i + 1) + ": ");
                try {
                    numbers[i] = getValidatedNumber(scanner);
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
    }

    /**
     * Reads and validates user input to ensure it's a valid integer.
     *
     * @param scanner Scanner object to read input
     * @return A validated integer input from the user
     * @throws InputMismatchException if the input is not a valid integer
     */
    public static int getValidatedNumber(Scanner scanner) throws InputMismatchException {
        if (!scanner.hasNextInt()) {
            scanner.next();  // clear the invalid input
            throw new InputMismatchException("Input is not a valid integer.");
        }
        return scanner.nextInt();
    }

    /**
     * Recursively calculates the sum of numbers in an array starting from a given index.
     *
     * @param numbers the array of integers to sum
     * @param index the current index in the array
     * @return the sum of the numbers from the current index to the end of the array
     */
    public static int sumNumbers(int[] numbers, int index) {
        // Base case: if we've reached the end of the array, return 0
        if (index == numbers.length) {
            return 0;
        }
        // Recursive case: return the current number plus the sum of the rest
        return numbers[index] + sumNumbers(numbers, index + 1);
    }
}
