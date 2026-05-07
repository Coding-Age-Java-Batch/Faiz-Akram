package Exception.Sessions;

public class NormalException {

    public static void methodA(int age){
        if (age < 18) {
            throw new IllegalArgumentException();
        }
        else {
            System.out.println("Eligible:");
        }
    }

    static void main(String[] args) {
        methodA(14);
        System.out.println("This line will not be executed:");
    }
}
