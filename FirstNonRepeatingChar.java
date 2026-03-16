package Stringgg;

public class FirstNonRepeatingChar {
    public static char FirstNorRepeating(String str){

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    count++;
                }
                else{
                    break;
                }

            }
            if(count == 0){
                char n = str.charAt(i);
            }
        }
        return 'c';
    }

}
