package Exception.Sessions;

import java.io.FileReader;
import java.io.IOException;


public class ThrowException {

    public static void readFile() throws IOException{
        FileReader fr = new FileReader("abc.txt");
    }

    static void main(String[] args) {
        try{
            readFile();
        }
        catch (IOException e){
            System.out.println("Exception Handled:");
        }
    }


}
