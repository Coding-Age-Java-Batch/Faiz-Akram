package Stringgg;
public class Anagaram {
    public static boolean isAnagram(String str1, String str2) {
        int sizeOfA= 0;
        int sizeOfSecA= 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length() ; i++) {
                if (str1.charAt(i)== 'A'){
                    sizeOfA++;
                }
            }
            for (int i = 0; i < str2.length() ; i++) {

                if (str2.charAt(i)== 'A'){
                    sizeOfSecA ++;
                }
            }
        }
        if (sizeOfA == sizeOfSecA) {
            return true;
        }else {
            return false;
        }
    }
    static void main(String[] args) {
        boolean s = isAnagram("AAAA","AAAA");
        System.out.println(s);

        boolean ss = isAnagram("AAAA", "AAAA");
        System.out.println(ss);
    }
}
