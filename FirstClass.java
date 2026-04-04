package Stringgg;

import java.util.*;
public class FirstClass {
    static void main(String[] args) {
        String name = new String("Hello world");
        String reverse = new String ("");

        for (int i = name.length()-1; i >=0; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);
    }

}
