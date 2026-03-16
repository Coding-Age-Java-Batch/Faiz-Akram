package ExceptionQuestions;

public class Question_8 {
    public void Negative(int num){
        if (num<0){
            throw new IllegalArgumentException();
        }
        System.out.println("Number is positive");
    }

    static void main(String[] args) {
        Question_8 q = new Question_8();
        q.Negative(-5);
    }
}
