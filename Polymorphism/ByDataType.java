package Polymorphism;

public class ByDataType {

    void show(int a, int b){
        System.out.println(a + ": "+ b);
    }
    void show(int a, String b){
        System.out.println(a+ ": "+b);
    }
    void show(String a, int b){
        System.out.println(a+ " : "+ b);
    }

    public  void main(String[] args){
        ByDataType b = new ByDataType();
        b.show(53,23);
        b.show(5, "h");
        b.show("c", 5);
    }

}
