package Encapsulation;

public class Encapsulationn {
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    static void main(String[] args) {
        Encapsulationn e = new Encapsulationn();
        e.setName("Akram");
        e.setAge(35);
        System.out.println("Person name is: "+e.getName());
        System.out.println("Person age is : "+ e.getAge());
    }
}
