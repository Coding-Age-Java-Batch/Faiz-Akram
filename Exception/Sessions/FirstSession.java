package Exception.Sessions;

public class FirstSession {

    public void withdraw(int amount){
        if (amount<0){
            throw new IllegalArgumentException("Amount can't be negative:");
        }
        else {
            System.out.println("Amount successfully withdrawn:");
        }
    }

    static void main(String[] args) {
        FirstSession fs = new FirstSession();
        fs.withdraw(500);
    }
}
