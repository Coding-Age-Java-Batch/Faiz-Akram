package Stringgg;

import org.w3c.dom.ls.LSOutput;

public class CountWord {
    public static int countWords(String sentence){
        int count =0;

        for(int i=0;i<sentence.length();i++){
            if ((sentence.charAt(i) >= 65 && sentence.charAt(i) <= 90) ||
                    (sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122)) {
                count++;
            }
        }

        return count;
    }

    static void main(String[] args) {
        int numberOfWord= countWords("hello world how are you every one welcome in our classes");
        System.out.println(numberOfWord);
    }
}
