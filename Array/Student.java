package Array;

public class Student {

    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Id is "+ id + " Name is: "+ name );
    }

    static void main() {
        Student[] st = new Student[5];
        st[0] = new Student(100, "Akram");
        st[1] = new Student(101, "Tashkeel");
        st[2] = new Student(102, "Shashi ");
        st[3] = new Student(103, "Amir");
        st[4] = new Student(104, "Rishi");


        for (int i = 0 ; i<st.length; i++){
            st[i].display();
        }
    }
}
