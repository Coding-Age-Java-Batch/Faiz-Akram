package Stringgg;

public class ToggleChatGPT {

    public static String toggleCase(String str) {

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
            else {
                result.append(ch);  // space or special character
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input = "Hello World";

        System.out.println(toggleCase(input));
    }
}
