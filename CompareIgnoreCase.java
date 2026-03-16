package Stringgg;

public class CompareIgnoreCase {

    public static boolean compareIgnoreCase(String s, String ss){
        if (s.equalsIgnoreCase(ss)){
            return true;
        }
        else {
            return false;
        }
    }

    static void main(String[] args) {
        boolean b = compareIgnoreCase("Java", "java");
        System.out.println(b);
    }
}
