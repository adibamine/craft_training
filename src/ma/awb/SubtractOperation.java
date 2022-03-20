package ma.awb;

public class SubtractOperation implements CalculatorOperation {

    @Override
    public double calculate(double numbA, double numbB) {
        return numbA - numbB;
    }
}
