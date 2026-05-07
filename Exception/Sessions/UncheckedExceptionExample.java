package Exception.Sessions;



public class UncheckedExceptionExample {

    public static void divide(int a, int b) {
        // This line can throw an ArithmeticException if b is 0
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Program started.");

        // Calling the divide method with a potential division by zero
        divide(10, 0); // This will cause an ArithmeticException at runtime

        System.out.println("Program finished (this line might not be reached).");
    }
}