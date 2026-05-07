package Exception;

public class SimpleCheckedException {

    public static void main(String[] args) {
        System.out.println("Starting to sleep...");

        try {
            // Thread.sleep() can throw an InterruptedException,
            // which is a checked exception.
            // The compiler forces us to handle it.
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            // If the sleep is interrupted, this block runs.
            System.err.println("Sleep was interrupted!");
            e.printStackTrace(); // Prints the exception details
        }

        System.out.println("Finished sleeping!");
    }
}