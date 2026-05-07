package Abstractionn;

interface InterFace {
    void start();
    void stop();
    int x = 10;

    static void main(String[] args) {
        Bike b = new Bike();
        b.run();
        b.start();
        b.stop();
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>");
        Car c = new Car();
        c.run();
        c.start();
        c.stop();
        System.out.println(x);
    }
}

class Bike implements InterFace {
    void run() {
        System.out.println(x);
        System.out.println("About Bike:");
    }
    public void start(){
        System.out.println("bruhhhmmmmmmmmmm mmmmm  m m");
    }
    public void stop(){
        System.out.println("kheernennennenkhenennee");
    }

}

class Car implements InterFace {
    void run() {
        System.out.println("About Car:");
    }
    public void start(){
        System.out.println("bhrereenehehenenehehhe");
    }
    public void stop(){
        System.out.println("kheenenennene");
    }

}
