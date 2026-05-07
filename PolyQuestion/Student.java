package PolyQuestion;

public class Student {

    void show(String name, int age){
        System.out.println("Name is: "+ name + "and roll number is:  "+ age);
    }
    void show(String name, int age, String course){
        System.out.println("Name is: "+ name + "And age is: "+ age+ " Course is:" + course);
    }

    public static  void main(String[] args){
        Student s = new Student();
        s.show("akram",56,"BCA");
        s.show("Tashkeel" , 53, "B.tech");
    }
}
