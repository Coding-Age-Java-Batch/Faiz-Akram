package Exception.NestedExcept;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 20};
        String text = null;

        try {
            int result = numbers[0] / numbers[1];
            System.out.println("Result of division: " + result);
            System.out.println("Value at index 3: " + numbers[3]);
            System.out.println("Length of text: " + text.length());

        } catch (ArithmeticException e) {
            // Ye block tab run hoga jab division by zero exception aayegi
            System.err.println("Error: Cannot divide by zero! " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Ye block tab run hoga jab array index out of bounds exception aayegi
            System.err.println("Error: Array index is out of bounds! " + e.getMessage());
        } catch (NullPointerException e) {
            // Ye block tab run hoga jab NullPointerException aayegi (e.g., null object par method call)
            System.err.println("Error: Tried to use a null object! " + e.getMessage());
        } catch (Exception e) {
            // Ye "catch-all" block hai. Agar koi aur exception upar wale blocks ne handle nahi ki, toh ye handle karega.
            // Aam taur par isko sabse last mein rakha jata hai.
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {

            System.out.println("Finally block executed. Cleanup done.");
        }

        System.out.println("Program continues after the try-catch block.");
    }
}