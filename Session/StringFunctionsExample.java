package Stringgg.Session;

import java.util.Arrays;

public class StringFunctionsExample {
    public static void main(String[] args) {
        String str = "Akram";
        String strr = "Akram";
        // length()
//        System.out.println("Length: " + str.length());
        // charAt()
//        System.out.println("First Character: " + str.charAt(0));
        // equals
        System.out.println(str.equals(strr));
        System.out.println(str.equalsIgnoreCase(strr));
        // substring
        System.out.println(str.substring(1) +" substring example:");
        System.out.println(str.substring(2,4) +" substring example");

        // toUpperCase()
//        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
//        System.out.println("Lowercase: " + str.toLowerCase());

        // contains()
//        System.out.println("Contains 'Java'? " + str.contains("Akram"));

        // replace()
//        System.out.println("Replace Java with Python: " + str.replace("A", "P"));

//        System.out.println(str);



        String s = "Hello world Welcome in Java Classes";
        String[] w = s.split("o");
        for (String ss: w){
            System.out.println(ss);
        }


//        length()
//        charAt()
//        equals()
//        equalsIgnoreCase()
//        substring()
//        replace()
//        split()
//        indexOf()
//        toUpperCase()
//        toLowerCase()
//        trim()
//        contains()


    }
}
