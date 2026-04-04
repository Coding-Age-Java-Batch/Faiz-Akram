package ArrayList;

import java.util.*;
public class SearchingElement {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        if (list.contains(50)) {
            System.out.println("Number found at "+list.indexOf(50)+":");
        }
    }

}
