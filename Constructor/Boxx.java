package Constructor;

public class Boxx {

    int a;
    int b;

    void show(){
        System.out.println("Hello World:"+ a+b);
    }

    Boxx(int aa, int bb){
        this.a=aa;
        this.b=bb;

        show();

        System.out.println("Addition of a and b is:"+a+b);
    }

    public static void main(String[] args){
        new Boxx(5,2);
        new Boxx(4,23);
    }
}
