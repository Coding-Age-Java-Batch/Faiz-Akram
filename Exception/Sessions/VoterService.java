package Exception.Sessions;

class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}



public class VoterService {
    public void chekAge(int age) throws UnderAgeException{
        if (age<18){
            throw new UnderAgeException("You are under age");
        }
        System.out.println("You are eligible for voting");
    }

    static void main(String[] args) {
        VoterService vs = new VoterService();

        try{
            vs.chekAge(13);
        }
        catch (UnderAgeException e){
            System.out.println(e.getMessage());
        }
    }

}
