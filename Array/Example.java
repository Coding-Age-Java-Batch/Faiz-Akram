package Array;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int rowSize = s.nextInt();
        int colSize = s.nextInt();
        int[][] number = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                number[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }

    }


}
