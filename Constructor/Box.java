package Constructor;

public class Box {

    int length;
    int width;

    public Box(int l, int w){
        this.length = l;
        this.width =w;
        System.out.println("Created a new Box: "+ length+ " " + width);
    }

    public void calculateArea(){
        System.out.println(length*width);

    }

    public static void main(String[] args){
        new Box(10,5);
        new Box(20, 30);


    }
}
