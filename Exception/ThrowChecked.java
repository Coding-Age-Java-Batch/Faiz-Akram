package Exception;
import java.io.IOException;

public class ThrowChecked {
    static void CheckAge(int age){
        try{
            if (age<18){
                throw new IOException("Error UnderAge:");
            }
            else {
                System.out.println("You are eligible:");
            }
        }
        catch (Exception e){
            System.out.println("No Eligible bcs: "+ e.getMessage());
        }
    }

    static void main(String[] args) {
        CheckAge(19);
    }

}
