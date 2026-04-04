package ExceptionQuestions;

public class Question_13 {
    public void method() throws Exception {
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch (Exception e){
            throw new Exception();
        }
    }

    static void main(String[] args) throws Exception {
        Question_13 obj = new Question_13();
        obj.method();
    }
}
