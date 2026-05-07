package Array;

public class JaggedArray {

    public static void main(String[] args){

        int [][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[6];

        arr[0][0]= 5;
        arr[0][1]= 10;

        arr[1][0]= 15;
        arr[1][1]= 20;
        arr[1][2]= 25;
        arr[1][3]= 30;

        arr[2][0]= 35;
        arr[2][1]= 40;
        arr[2][2]= 45;
        arr[2][3]= 50;
        arr[2][4]= 55;
        arr[2][5]= 60;



        for (int i= 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }

}
