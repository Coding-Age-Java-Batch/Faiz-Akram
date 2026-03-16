package Stringgg;
public class Duplicate {
    public static String removeDuplicate(String str) {

            String Para = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Para.indexOf(ch) == -1) {   // if character not already present
                    Para += ch;
                }
            }

            return Para;
        }
    public static void main(String[] args) {
        String result = removeDuplicate("ThereTTareTaTTheroT");
        System.out.println(result);
    }
}
