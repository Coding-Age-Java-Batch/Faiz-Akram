
//byte promote ho sakta hai → short, int, long, float, double
//short promote ho sakta hai → int, long, float, double
//char promote ho sakta hai → int, long, float, double
//int promote ho sakta hai → long, float, double
//long promote ho sakta hai → float, double
//float promote ho sakta hai → double

package Polymorphism;

public class Promotion {

//    void display(double a, double b) {
//        System.out.println("Method 1: int = " + a + ", double = " + b);
//    }

//    void display(float f, float n){
//        System.out.println(f +": "+ n);
//    }

    void display(int a, int b){
        System.out.println(a+": "+b);
    }

    public static void main(String[] args) {
        Promotion obj = new Promotion();
//        obj.display(355,45);
//        obj.display(4,7);
        obj.display('h','n');
    }
}
