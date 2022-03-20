package ma.awb;

public class DivideOperation implements CalculatorOperation {

    @Override
    public double calculate(double numbA, double numB) {
        return numbA / numB;
    }
}