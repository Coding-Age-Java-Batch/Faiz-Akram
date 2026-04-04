package ExceptionQuestions;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Question_12 {
    void method(){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter message");
            int number = sc.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

    static void main(String[] args) {
        Question_12 obj = new Question_12();
        obj.method();
    }
}
