package ExceptionQuestions;

public class Question_10 {

    public static  void methodA(int a, int b){
        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static  void methodB(int a, int b){
        methodA(a,b);
    }
    public static void methodC(int a, int b){
        methodB(a,b);
    }

    static void main(String[] args) {
        methodC(10,0);
    }

}
