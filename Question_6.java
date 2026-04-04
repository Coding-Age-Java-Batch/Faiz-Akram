package ExceptionQuestions;

class UnderageExcept extends RuntimeException {

    public UnderageExcept(String msg) {
        super(msg);
    }

}

public class  Question_6{
        public void checkAge(int age) throws RuntimeException{
            if (age<18){
                throw new RuntimeException("Error: Age must be 18:");
            }
            else {
                System.out.println("You are eligible for accessing this website:");
            }
        }

    static void main(String[] args) {
        Question_6 q = new Question_6();
        try {
            q.checkAge(12);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
