package Stringgg;
public class ReplaceSpaces {

    public static String replaceSpaces(String str) {

        // Replace all spaces with hyphen
        return str.replace(" ", "-");
    }

    public static void main(String[] args) {

        String input = "I love Java programming";
        String result = replaceSpaces(input);

        System.out.println(result);
    }
}