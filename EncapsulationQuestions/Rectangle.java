package EncapsulationQuestions;

//public class Rectangle {
//    private double length;
//    private double width;
//
//    public Rectangle(double newLength, double newWidth){
//        setLength(newLength);
//        setWidth(newWidth);
//    }
//    public void setLength(double lengths){
//        this.length = lengths;
//    }
//
//    public void setWidth(double widths) {
//        this.width = widths;
//    }
//
//    public double getArea (){
//        return length*width;
//    }
//    public double getPerimeter(){
//        return  2* (length + width);
//    }
//
//    public String isSqure(){
//        if (length == width){
//            return "True:";
//        }
//        else {
//            return "False: ";
//        }
//    }
//
//    static void main(String[] args) {
//        Rectangle rc = new Rectangle(5, 10);
////        System.out.println(rc.getArea());
////        System.out.println(rc.getPerimeter());
//        System.out.println(rc.isSqure());
//    }
//}



//● Private fields: length (double), width (double)
//● Constructor with length and width parameters
//● Getter and setter methods for both fields
//● Validate that length and width are positive numbers
//● getArea() method
//● getPerimeter() method
//● isSquare() method - returns true if length equals width

// by chatGPT

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double newLength, double newWidth){
        setLength(newLength);
        setWidth(newWidth);
    }

    public void setLength(double lengths){
        this.length = lengths;
    }

    public void setWidth(double widths){
        this.width = widths;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    public double getPerimeter(){
        return 2 * (getLength() + getWidth());
    }


//     It may also:
//    public double getArea(double l, double w){
//        return l * w;
//    }
//
//    public double getPerimeter(double l, double w){
//        return 2 * (l + w);
//    }




    public static void main(String[] args) {

        Rectangle r = new Rectangle(5,4);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}