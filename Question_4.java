package ExceptionQuestions;

public class Question_4 {

    public void division(){
        try{
            int result = 5/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println("Finally executed");
        }

    }

    static void main(String[] args) {
        Question_4 obj = new Question_4();
        obj.division();
    }

}
