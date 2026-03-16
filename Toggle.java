package Stringgg;

public class Toggle {
    public static String ToggleClass(String str){
//        String msg= "Hello World";
        String msg = str;
        String mst = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && (str.charAt(i) <= 90)) {
                mst = mst + (char) (msg.charAt(i)+32);
            }
            else if (str.charAt(i) >= 97 && (str.charAt(i) <= 122)) {
                mst = mst +(char) (msg.charAt(i)-32);
            }
            else{
                mst = mst+ (char) msg.charAt(i);
            }
        }
        return mst;
    }
    public static void main(String[] args){
        System.out.println(ToggleClass("kya HAAL H mErE dOOSttt jHAtKA"));
    }
}
