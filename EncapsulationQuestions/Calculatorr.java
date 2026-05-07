package EncapsulationQuestions;

public class Calculatorr {

    private double result;

    // Constructor
    public Calculatorr(){
        result = 0;
    }

    public void add(double number){
        result = result + number;
    }

    public void subtract(double number){
        result = result - number;
    }

    public void multiply(double number){
        result = result * number;
    }

    public void divide(double number){
        if(number != 0){
            result = result / number;
        }
        else{
            System.out.println("Cannot divide by zero");
        }
    }

    public double getResult(){
        return result;
    }

    public void clear(){
        result = 0;
    }

    public static void main(String[] args) {

        Calculatorr c = new Calculatorr();

//        c.add(10);     // 0 + 10
        c.add(5);
        c.subtract(4);// 10 + 5
        c.multiply(2); // 15 * 2
        c.divide(3);   // 30 / 3

        System.out.println("Result: " + c.getResult());

        c.clear();

        System.out.println("After clear: " + c.getResult());
    }
}
