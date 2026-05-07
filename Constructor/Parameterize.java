package Constructor;

public class Parameterize {

    int a;
    int b;

    void show(){
        System.out.println(a+b);
    }

    Parameterize(int aa, int bb){
        this.a=aa;
        this.b=bb;
        show();
    }

    public static void main(String[] args){

        new Parameterize(2,4);
    }
}
