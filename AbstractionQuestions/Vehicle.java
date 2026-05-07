package AbstractionQuestions;

public interface Vehicle {
    void start();
    void stop();
    String fuelType();

    static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        String c = car.fuelType();
        System.out.println(c);

        System.out.println("<<<<>>>>>>><<<<<<<<<<<<<<<>>>>>>>>>>");

        Bike bike = new Bike();
        bike.start();
        bike.stop();
        String cb = car.fuelType();
        System.out.println(cb);
    }

}
class Car implements Vehicle {
    public void start(){
        System.out.println("start with ghenghegnnghenen");
    }
    public void stop(){
        System.out.println("khenchkhenenenen");
    }
    public String fuelType(){
        return "Deisel";
    }
}

class Bike implements Vehicle {
    public void start(){
        System.out.println("start with keyss");
    }
    public void stop(){
        System.out.println("offff with keys");
    }
    public String fuelType(){
        return "Petrol:";
    }
}