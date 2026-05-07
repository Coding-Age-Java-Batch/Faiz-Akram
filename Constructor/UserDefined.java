package Constructor;

public class UserDefined {

    int id;
    String name;

    UserDefined(int idd, String namee){
        this.id = idd;
        this.name = namee;


    }

    UserDefined(UserDefined s) {
        this.id = s.id;
        this.name = s.name;

    }

    void display(){
        System.out.println(id+name);
    }

    public static  void main(String[] args){
        UserDefined s = new UserDefined(23, "akram");
        UserDefined s1 = new UserDefined(s);
        s1.display();

        System.out.println("--------------------------");
        System.out.println("Now we create copy of These:");

        UserDefined sc = new UserDefined(s);
        sc.display();

        System.out.println("-----------------------------");
        System.out.println("We change values: ");

        sc.id= 203;
        sc.name = "Danish:";

        sc.display();
        s.display();


    }
}
