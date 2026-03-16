package Stringgg;

public class DuplicateeChar {

    public static String removeDuplicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            boolean isDuplicate = false;

            // check if current character already exists in result
            for (int j = 0; j < result.length(); j++) {

                if (current == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, add to result
            if (!isDuplicate) {
                result = result + current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String output = removeDuplicate("programming");
        System.out.println(output);
    }
}
