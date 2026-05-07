package Constructor;

public class NoArgumentConstructor {

    int a;
    int b;

    NoArgumentConstructor(){
        this.a = 29;
        this.b=200;
        System.out.println(a+b);
    }

    public static void main(String[] args){
        new NoArgumentConstructor();
    }
}
