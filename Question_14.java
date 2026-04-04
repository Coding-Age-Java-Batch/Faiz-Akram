package ExceptionQuestions;

public class Question_14 extends Exception {
    public void Insufficient(int amount) throws Exception {
        if (amount < 0){
            throw new Exception();
        }
        System.out.println("Amount debited successfully");
    }

    public static void main(String[] args) throws Exception {
        Question_14 obj = new Question_14();
        obj.Insufficient(-10);
//        try{
//            obj.Insufficient(-2000);
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    }

}
