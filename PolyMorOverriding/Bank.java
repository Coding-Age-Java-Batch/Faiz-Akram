package PolyMorOverriding;

class Bank {
    int getInterest(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    int getInterest(){
        return 5;
    }
}
class HDFC extends Bank{
    @Override
    int getInterest(){
        return 10;
    }
}

class ICIC extends Bank{
    @Override
    int getInterest(){
        return 15;
    }

//    public static void main(String[] args){
//
//        Bank Bank_SBI = new SBI();
//        int result_SBI = Bank_SBI.getInterest();
//        System.out.println("SBI Interest rate is: "+result_SBI);
//
//        Bank bHDFC = new HDFC();
//        int HDFCResult = bHDFC.getInterest();
//        System.out.println("HDFC Interest is : "+ HDFCResult);
//
//
//        Bank Bank_ICI = new ICIC();
//        int result_ICIC = Bank_ICI.getInterest();
//        System.out.println("ICIC Interest rate is: "+result_ICIC);
//
//
//    }

    public static void main(String[] args){
        Bank b;

        b = new SBI();
        int result = b.getInterest();
        System.out.println("SBI Interest Rate is: "+result);

        b = new HDFC();
        int resultt = b.getInterest();
        System.out.println("HDFC Interest Rate is: "+resultt);

        b = new ICIC();
        int resulttt = b.getInterest();
        System.out.println("ICIC Interest Rate is: "+resulttt);

    }
}