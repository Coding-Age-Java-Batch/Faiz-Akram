package Exception.NestedExcept;

public class NestedException {
    public static void main(String[] args){
        try{
            System.out.println("Starting the program:");
            try{
                int result = 10/0;
                System.out.println(result);
            }
            catch(Exception e){
                System.out.println("Error: "+ e.getMessage());
            }

            int[] numbers= {2,34, 5};
            System.out.println(numbers[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("General catch: Something went wrong:");
        }


        System.out.println("Thanks for visting :");
    }
}
