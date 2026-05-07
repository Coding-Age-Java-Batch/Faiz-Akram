package Polymorphism;

public class ByOrderOfDataType {
    void show(int roll, double mark){
        System.out.println("roll: " + roll + "mark: "+mark);
    }
    void show(double mark, int roll){
        System.out.println("roll: " + roll + "mark: "+mark);
    }
    public static void main(String[] args){
        ByOrderOfDataType b = new ByOrderOfDataType();
        b.show(45,78.87);
        b.show(32.42,34);
    }
}
