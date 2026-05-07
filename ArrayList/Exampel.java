package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Exampel {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.get(3));
        list.set(2,32);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.contains(40);
    }

}
