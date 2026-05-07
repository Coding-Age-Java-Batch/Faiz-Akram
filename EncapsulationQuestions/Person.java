
//Problem: Create a Person class with proper encapsulation.
//Requirements:
//        ● Private fields: name (String), age (int), email (String)
//● Constructor to initialize all fields
//● Getter and setter methods for all fields
//● Age setter should only accept values between 0-120
//        ● Email setter should check if the email contains the "@" symbol
//● The toString() method to display person's information
//Test Scenario: Create a person, set age to 25, try to set age to -5 (should fail),
//update email.

package EncapsulationQuestions;

public class Person {
    private String name;
    private int age;
    private  String email;

    public Person(String newName, int newAge, String newEmail){
        this.name = newName;
        setAge(newAge);
        setEmail(newEmail);
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge ){
        if (newAge>0 && newAge<120){
            this.age = newAge;
        }
        else {
            System.out.println("Invalid Age");
        }
    }
    public void setEmail(String newEmail){
        if (newEmail.contains("@") ){
            this.email= newEmail;
        }
        else {
            System.out.println("Invalid input:");
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return "Name: "+name + "Age: "+ age + "Email: "+ email;
    }

    static void main(String[] args) {
        Person p = new Person("Akram", 29, " faiz@gmail.com");
        Person p1 = new Person("Akram alam ", 39, " faizalam@gmail.com");

//        p.setName("Akram");
//        p.setAge(29);
//        p.setEmail("faiz@gmail.com");

//        System.out.println(p.getName());
//        System.out.println(p.getAge());
//        System.out.println(p.getEmail());
        System.out.println(p);   // p.String();
        System.out.println(p1);
    }

}
