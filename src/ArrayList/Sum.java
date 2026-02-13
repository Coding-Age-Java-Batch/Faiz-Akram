package ArrayList;

import java.util.*;
import java.util.Iterator;
import java.util.ArrayList;


public class Sum {

    static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<>();
        Number.add(10);
        Number.add(20);
        Number.add(30);
        Number.add(40);
        Number.add(50);

        int Sum = 0;

        for (int i = 0; i <Number.size(); i++){
            Sum = Sum + Number.get(i);
        }
        System.out.println(Sum);

    }
}
