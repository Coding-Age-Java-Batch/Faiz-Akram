package Array;

import java.util.Scanner;

public class ArraySecondClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of row:");

        int row = sc.nextInt();

        System.out.println("Enter number of columns");

        int column = sc.nextInt();

        int [][] arr = new int[row][column];

        for(int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }



        System.out.println("Enter another number of row:");

        int row2 = sc.nextInt();

        System.out.println("Enter number of columns");

        int column2 = sc.nextInt();

        int [][] arr2 = new int[row2][column2];


        for(int i = 0; i <row2 ; i++){
            for (int j = 0; j<column2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<row2; i++){
            for (int j = 0; j<column2; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }


        int a = 0;

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j<column2; j++) {
                if (arr[i][j] != arr2[i][j]){
                    a++;
                    break;
                }
            }
            if (a != 0) {
                break;
            }
        }

        if (a != 0) {
            System.out.println("Both number are not Equal");
        }
        else{
            System.out.println("Both number are equal:");
        }







    }




}
