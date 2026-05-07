package EncapsulationQuestions;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);

        deposit(9000);
        withdraw(2000);
        printBalance();


    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        setBalance(balance);
    }
    public void withdraw(double amount){
        balance = balance - amount;
        setBalance(balance);
    }
    public void printBalance(){
        double s = getBalance();
        System.out.println(s);
    }
    public String toString(){
        return "Account Number is: " + accountNumber + " Account Holder name: "+ accountHolderName+ " Balance is: " + balance;
    }
//    public void transfer(){
//
//    }

    static void main(String[] args) {
        BankAccount b = new BankAccount("20303920", "Akram", 10000.00);
//        String s = b.toString();
        System.out.println(b.toString());
    }

}



//● Private fields: accountNumber (String), accountHolderName (String),
//balance (double)
//● Constructor with account number and holder name (balance starts at 0)
//● deposit(double amount) method - only allow positive amounts
//● withdraw(double amount) method - check sufficient balance
//● getBalance() method
//● getAccountInfo() method - returns account details (but not balance)
//● transfer(BankAccount otherAccount, double amount) method
