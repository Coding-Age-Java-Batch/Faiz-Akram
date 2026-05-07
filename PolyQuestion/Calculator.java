package PolyQuestion;

public class Calculator {

    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        c.add(5,3);
        c.add(5 ,35,2);
    }
}
