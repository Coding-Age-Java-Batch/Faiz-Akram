package Exception;


class BankingException extends Exception {
    public BankingException(String msg){
        super(msg);
    }
}

public class Banking{

    public void CheckBalance(int amount) throws BankingException{
        if (amount<0){
            throw new BankingException("Amount is negative");
        }
        else{
            System.out.println("Amount has been withdrawn:");
        }
    }

    static void main(String[] args) {

        Banking b = new Banking();

        try {
            b.CheckBalance(-90);
        }
        catch (BankingException e){
            System.out.println("Error bcs : " + e.getMessage());
        }
    }

}
