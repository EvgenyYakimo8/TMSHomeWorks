package by.tms.lesson21CalculatorJavaSE.model;

public class Operation {
    private double num1, num2, result;
    private String type;


    public Operation(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }

    public Operation(double num1, double num2, String type, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.type = type;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
