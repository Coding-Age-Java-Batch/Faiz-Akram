package EncapsulationQuestions;

public class Calculator {

    private double result ;

    public Calculator(){
        this.result =0;

    }

    public void setResult(double updatedResult){
        result = updatedResult;
    }


    public double add(double a, double b){
       return a+b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public double multiplication(double a, double b){
        return a*b;

    }

    public double division(double a, double b){
        return a/b;
    }

    public void getResult(double k, double l) {
        System.out.println(multiplication(k, l));
        System.out.println(division(k, l));
        System.out.println(add(k, l));
    }

    static void main(String[] args) {
        Calculator c = new Calculator();
        c.getResult(5, 9);
    }



}




//Question 2: Simple Calculator
//Problem: Design a Calculator class that encapsulates basic math operations.
//Requirements:
//● Private fields: result (double) to store current result
//● Constructor initializes result to 0
//● add(double number) method
//● subtract(double number) method
//● multiply(double number) method
//● divide(double number) method (prevent division by zero)
//● getResult() method
//● clear() method to reset result to 0
//Test Scenario: Perform calculations: 10 + 5, × 2, ÷ 3, then clear and start new
//calculation.