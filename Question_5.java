package ExceptionQuestions;

public class Question_5 {
    public static void main(String[] args) {
        String s = "12345";
        try{
            int number = Integer.parseInt(s);

            try{
                int result= 10/0;
            } catch (ArithmeticException e) {
//                throw new ArithmeticException();
                System.out.println("Error: "+e.getMessage());
            }

            System.out.println("Thanks for visiting:");


        }
        catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
