package Stringgg;
import java.util.Scanner;

class RotationString {
    public static void method(){
        Scanner s = new Scanner(System.in);
        String First= s.nextLine();
        String Second=s.nextLine();
        String Concatenated= First+First;
//
        if (Concatenated.contains(Second) ){
            System.out.println("It is String Rotation:");
        }
        else {
            System.out.println("It is not String Rotation:");
        }
    }

    public static void main(String[] args) {
        method();
    }
}
