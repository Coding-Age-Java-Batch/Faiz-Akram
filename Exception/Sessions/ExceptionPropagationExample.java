package Exception.Sessions;

public class ExceptionPropagationExample {

    public static void methodC() {
        System.out.println("Inside methodC");
        int result = 10 / 0;
        System.out.println("This line will not be executed in methodC");
    }

    public static void methodB() {
        System.out.println("Inside methodB");
        methodC();
        System.out.println("This line will not be executed in methodB if methodC throws an exception");
    }

    public static void methodA() {
        System.out.println("Inside methodA");
        try {
            methodB(); // Calls methodB
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException in methodA: " + e.getMessage());
        }
        System.out.println("Execution continues in methodA after handling the exception.");
    }

    public static void main(String[] args) {
        System.out.println("Starting main method");
        methodA();
        System.out.println("Main method finished");
    }
}