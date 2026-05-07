package Exception;

public class UncheckedExceptionExample {

    public static void divideNumbers(int numerator, int denominator) {
        // This method does not declare 'throws' any exception,
        // because ArithmeticException is unchecked.
        // The compiler doesn't force us to handle it here.
        System.out.println("Attempting to divide " + numerator + " by " + denominator);
        int result = numerator / denominator; // This line can throw an ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Valid Division ---");
        divideNumbers(10, 2); // This will execute successfully

        System.out.println("\n--- Scenario 2: Division by Zero (Unchecked Exception) ---");
        try {
            // We can optionally use a try-catch, but the compiler doesn't demand it.
            // If we didn't have this try-catch, the program would crash here.
            divideNumbers(10, 0); // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Caught an unchecked exception: " + e.getMessage());
            System.err.println("Don't divide by zero, silly!");
            // e.printStackTrace(); // Uncomment for full stack trace
        }

        System.out.println("\n--- Program continues after handling (or crashing) ---");
        System.out.println("This message will print if the exception was caught.");
        System.out.println("If no try-catch, the program would terminate before this line in Scenario 2.");
    }
}
