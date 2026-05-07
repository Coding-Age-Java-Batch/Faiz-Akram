package PolyMorOverriding;

class Shapee {
    public void printShape() {
        System.out.println("This is a shape.");
    }
}

class Square extends Shapee {
    @Override
    public void printShape() {
        System.out.println("This is a square.");
    }
}

class Triangle extends Shapee {
    @Override
    public void printShape() {
        System.out.println("This is a triangle.");
    }

    public static void main(String[] args) {
        Shapee genericShape = new Shapee();
        Shapee square = new Square();
        Shapee triangle = new Triangle();

        genericShape.printShape();
        square.printShape();
        triangle.printShape();
    }
}




