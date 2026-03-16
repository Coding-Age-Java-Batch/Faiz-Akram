package ArrayList;


import java.util.*;
public class SecondGreatNum {
    static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(9);
        num.add(3);
        num.add(12);
        num.add(4);
        num.add(85);
        num.add(32);

        int max = 0;
        int max2 = 0;

        for (int i = 0; i<num.size();i++){
            if (num.get(i)>max){
                max2 = max;
                max = num.get(i);

            }
        }
        System.out.println("Greatest Number is:"+max);
        System.out.println("Second Greates Number is: "+max2);
    }
}
