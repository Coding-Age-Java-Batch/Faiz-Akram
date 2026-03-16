package ArrayList;
import java.util.*;

public class GreatestNumber {
    static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(2);
        num.add(30);
        num.add(5);
        num.add(10);
        num.add(6);

        int max = num.get(0);

        for (int i =1; i<num.size();i++){
            if (num.get(i)>max){
                max = num.get(i);
            }
        }
        System.out.println(max);

    }
}
