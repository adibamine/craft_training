package ma.awb;


public class AddOperation implements CalculatorOperation {

    @Override
    public double calculate(double numbA, double numB) {
        return numbA + numB;
    }
}