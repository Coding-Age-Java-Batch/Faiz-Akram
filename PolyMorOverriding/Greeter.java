package PolyMorOverriding;

public class Greeter {

    void greet(){
        System.out.println("Good Morning");
    }
    void greet(String name){
        System.out.println("Good Morning "+name);
    }
    void greet(String timeOfDay, String name){
        System.out.println("Good "+timeOfDay +" "+name);
    }

    public static void main(String[] args){
        Greeter g = new Greeter();
        g.greet();
        g.greet("Akram");
        g.greet("Morning","Akram");
    }
}
