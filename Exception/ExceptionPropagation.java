package Exception;

public class ExceptionPropagation {

    public static void methodA(){
        int result = 10/0;
        System.out.println("Result is: "+ result);
    }
    public static void methodB(){
        methodA();
        System.out.println("If methodA occurs any Exception, then this line will not be executed:");
        int resultt= 10 /2;
        System.out.println(resultt); // this line not be executed and will not print result:
    }
    public static void methodC(){
        try{
            methodA(); // It will return a exception: It is risky code or operation that will occurs exception: now we have to catch it:
        }
        catch (Exception e){
            System.out.println("Error occurred: "+e.getMessage());
        }
        System.out.println("After Identify exception in this program, this line will be executed:");
    }

    static void main(String[] args) {
        methodC();
    }


}
