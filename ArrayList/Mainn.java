package ArrayList;

import java.util.ArrayList;
public class Mainn {

    public static void main() {
        ArrayList<String> n = new ArrayList<>();
        n.add("Akram");
        n.add("Tashkeel");
        n.add("Sajid");
        n.add("shahshii");

        System.out.println(n.get(2));
        n.set(3, "Soni");
        n.remove(0);
        n.set(0,"Divya");
        n.contains("Soni");

        for (int i=0; i<n.size(); i++){
            System.out.println(n.get(i));
        }

        System.out.println("---------***---------");
        for (String nn : n){
            System.out.println(nn);
        }
    }
}
