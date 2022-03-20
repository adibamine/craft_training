package ma.awb;

public class Calculator {

    public double calculate(double numA, double numB, CalculatorOperation operation) {
        return operation.calculate(numA, numB);
    }
}