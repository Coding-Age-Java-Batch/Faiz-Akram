package EncapsulationQuestions;

public class Circle {

    private double radius;

    public Circle(double newRadius){
        this.radius = newRadius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            System.out.println("Invalid Input:");
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (double) 22 /7* radius*radius;
    }
    public double getCircumference(){
        return 2* (double) 22/7 * radius;
    }
    public double getDiameter(){
        return 2*radius;
    }

    static void main(String[] args) {
        Circle c = new Circle(22.20);
        System.out.println("Radius: "+c.getRadius());
        System.out.println("Area of Radius: "+ c.getArea());
        System.out.println("Circumference of Radius: "+ c.getCircumference());
        System.out.println("Diameter of Radius: "+ c.getDiameter());
    }
}


//● Private field: radius (double)
//● Constructor with radius parameter
//● setRadius(double radius) - validate radius is positive
//● getRadius() method
//● getArea() method - calculate using π × radius²
//● getCircumference() method - calculate using 2 × π × radius
//● getDiameter() method