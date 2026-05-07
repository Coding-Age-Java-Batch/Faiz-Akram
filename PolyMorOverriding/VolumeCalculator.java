package PolyMorOverriding;

public class VolumeCalculator {

    void volume(int side){
        System.out.println("Cube: "+ side*side*side);
    }
    void volume(int length, int breadth, int height){
        System.out.println("Cuboid: "+ (length*breadth*height));
    }
    void volume(double radius, double height){
        System.out.println("Cuboid: "+ (3.14*radius*radius)*height);
    }

    public static void main(String[] args){
        VolumeCalculator v = new VolumeCalculator();
        v.volume(5);
        v.volume(6,8,4);
        v.volume(4.5,7.4);

    }
}
