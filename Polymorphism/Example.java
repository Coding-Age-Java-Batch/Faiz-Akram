package Polymorphism;

public class Example {

    void show(int a, int b){
        System.out.println(a+b);
    }
    void show(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void show(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args){
        Example e = new Example();
        e.show(5,2);
        e.show(5,2,9);
        e.show(5,2,5,9);
    }

}
