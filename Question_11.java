package ExceptionQuestions;

public class Question_11 {
    public void method(){
        try{
            int result = 10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        Question_11  q= new Question_11();
        q.method();

    }

}
