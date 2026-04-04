package ExceptionQuestions;

public class Question_3 {

    public static void main (String[] args){
        int a=10;
        int b=2;

        int[] number = new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;

        try{
            int c = a/b;
            System.out.println(c);
            System.out.println(number[6]);
        }
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Thanks:");
        }

    }



}
