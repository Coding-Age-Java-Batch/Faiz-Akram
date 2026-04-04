package Stringgg;

class CountVowel {
    public static int countVowels(){
        String s;
        s="kya haal h lalaa";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a' ||
                    s.charAt(i) == 'E' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'I' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'U' || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int NumberOFVowels = countVowels();
        System.out.println(NumberOFVowels);
    }
}
