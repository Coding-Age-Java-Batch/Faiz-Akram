package ExceptionQuestions;
//import java.util.F

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Question_9 {
    public static void main(String[] args) throws Exception {
        try{
            FileReader f = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
//            throw new FileNotFoundException();
            System.out.println("Errorr: "+e.getMessage());
        }
    }
}
