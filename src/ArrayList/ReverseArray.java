package ArrayList;

import java.util.*;
public class ReverseArray {

    static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.println(num.get(i));
        }
    }


}
