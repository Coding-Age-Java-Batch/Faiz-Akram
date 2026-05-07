package PolyQuestion;

public class AreaOfCircle {
    double area(int radius){
        return 3.14*radius*radius;
    }
    int area(int length,int breadth){
        return length*breadth;
    }
    double area(double base, double height){
        return 1/2 * base* height;
    }

    public static void main(String[] args) {
        AreaOfCircle ar = new AreaOfCircle();
        double c = ar.area(5);
        System.out.println("Area of circle is : "+ c);

        int AreaOfRectangle= ar.area(21,24);
        System.out.println("Area of Rectangle is: "+ AreaOfRectangle);

        double AreaofTriangle = ar.area(56, 55);
        System.out.println("Area of Triangle is: "+ AreaofTriangle);



    }


}
