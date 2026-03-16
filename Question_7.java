package ExceptionQuestions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Question_7 {

    public void method() throws IOException{
//        FileReader f = new FileReader("abc.txt");
        try{
            FileReader f= new FileReader("abc.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }

        try{
            int result = 100/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e.getMessage());
        }

    }

    static void main(String[] args) throws IOException{
        Question_7 q = new Question_7();
        q.method();
    }

}
