package ArrayList;
import java.util.*;
public class Sorting {

    static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(29);
        n.add(32);
        n.add(24);
        n.add(13);
        n.add(84);
        n.add(43);

        Collections.sort(n);
        System.out.println("-------*-------");
        System.out.println(n);
        Collections.reverse(n);
        System.out.println(n);



    }
}
