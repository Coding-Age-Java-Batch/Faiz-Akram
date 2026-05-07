
package PolyMorOverriding;

class Shape {
    void draw(){
        System.out.println("Drawing shape:");
    };
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle:");
    }
    void draw(int radius){
        System.out.println("Circle Radius is " +radius);
    }

}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Rectangle");
    }

    public static void main(String[] args){
        Shape s = new Circle();
        s.draw();
        ((Circle)s).draw(5);

        Shape ss = new Rectangle();
        ss.draw();

    }

}




