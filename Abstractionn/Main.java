package Abstractionn;

interface  InterfaceExample{
    void paymentMethod();
    void paidAmount();
}

class UPI implements InterfaceExample{
    @Override
    public void paymentMethod() {
        System.out.println("By UPI:");
    }

    @Override
    public void paidAmount() {
        System.out.println("5000");
    }
}

class Card implements InterfaceExample{
    @Override
    public void paymentMethod(){
        System.out.println("By credit card:");
    }

    @Override
    public void paidAmount(){
        System.out.println("7000");
    }
}

class Banking implements InterfaceExample{
    @Override
    public void paymentMethod(){
        System.out.println("By bank:");
    }

    @Override
    public void paidAmount(){
        System.out.println("9000");
    }
}




public class Main {
    static void main() {
        InterfaceExample i;

        i = new UPI();
        i.paymentMethod();
        i.paidAmount();

        i=new Card();
        i.paymentMethod();
        i.paidAmount();

        i = new Banking();
        i.paymentMethod();
        i.paidAmount();
    }

}
