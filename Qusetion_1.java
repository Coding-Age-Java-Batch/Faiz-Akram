package ExceptionQuestions;


public class Qusetion_1 {

    public void division(int a, int b){
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

//        if (a/b){
//            throw new ArithmeticException();
//        }
//        else {
//            System.out.println("Error");
//        }
    }

    static void main(String[] args) {
        Qusetion_1 q1 = new Qusetion_1();
        q1.division(100, 0);
    }

}
