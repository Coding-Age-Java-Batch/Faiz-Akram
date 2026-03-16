package ExceptionQuestions;

public class Question_2 {
    public void array(){
        int[] num= new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;

        try{
            System.out.println(num[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    static void main(String[] args) {
        Question_2 q = new Question_2();
        q.array();
    }
}
