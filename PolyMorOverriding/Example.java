package PolyMorOverriding;

class Example {
    void show(){
        System.out.println("Hell World:");
    }

    void showw(int a, int b){
        System.out.println("Addition of a and b is: "+ (a+b));
    }
}


class Example1 extends Example{

    @Override
    void show(){
        System.out.println("hello world o:");
    }

    void showw(int a, int b){
        System.out.println("Subtraction of a and b is: " + (a-b));
    }


}

class Example2 extends Example1{
    @Override
    void showw(int a, int b){
        System.out.println("Multiplication of a and b is : "+ (a*b));
    }

    public static void main(String[] args){
        Example2 e = new Example2();
//        e.show();
        e.showw(5,4);
    }
}