package Abstractionn;

abstract class Examplee {

    abstract void college();

    void className(){
        System.out.println("It is standard one:");
    }
}


class Onee extends Examplee{

    @Override
    void college(){
        System.out.println("Baklol college:");
    }

    @Override
    void className() {
        System.out.println("It is first class:");
    }
}

class Twoo extends Examplee{
    @Override
    void college() {
        System.out.println("Baklol collegse:");
    }

    @Override
    void className() {
        System.out.println("statndard twor");
    }
}

public class Example{
    static void main(String[] args) {

        Examplee e = new Onee();
        e.college();
        e.className();

        Examplee e1 = new Twoo();
        e1.college();
        e1.className();

    }
}