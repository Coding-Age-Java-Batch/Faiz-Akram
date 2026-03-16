package ArrayList;

import java.util.*;
public class CountingEventOdd {

    static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();

        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
        n.add(7);
        n.add(8);

        int EvenCount = 0;
        int OddCount = 0;
        for (int i = 0; i<n.size();i++){
            if (n.get(i)%2==0){
                EvenCount++;
            }
            else{
                OddCount++;
            }
        }
        System.out.println("Even Number is: "+EvenCount);
        System.out.println("Odd Number is: "+OddCount);
    }
}
