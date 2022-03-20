package ma.awb;

public class MultiplyOperation implements CalculatorOperation {

    @Override
    public double calculate(double numbA, double numB) {
        return numbA * numB;
    }
}