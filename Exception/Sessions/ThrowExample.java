package Exception.Sessions;

import java.io.IOException;

public class ThrowExample {
    static void checkAge(int age){
        try{
            if (age<18){
                throw new IOException("Age must be above 18");
            }
            else {
                System.out.println("You can vote:");
            }
        } catch (IOException e) {
            System.out.println("Exception caught:" + e.getMessage());
        }
    }

    static void main(String[] args) {
        checkAge(19);
    }
}
