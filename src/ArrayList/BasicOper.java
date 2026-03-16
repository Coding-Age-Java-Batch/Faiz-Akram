package ArrayList;

import java.util.*;
public class BasicOper {

    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Python");
        name.add("Java");
        name.add("C++");

        System.out.println("-----****-------");
        System.out.println(name);
        name.remove("Python");
        name.remove(1);
        System.out.println("-----****-------");
        System.out.println(name);
        System.out.println("______*______");
        name.add(0,"JavaScript");
        System.out.println(name);



    }
}
