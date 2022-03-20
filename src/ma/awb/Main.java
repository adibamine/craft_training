package ma.awb;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(100, 50, Calculator.Operation.ADD));
        System.out.println(calculator.calculate(100, 50, Calculator.Operation.SUBTRACT));
        System.out.println(calculator.calculate(100, 50, Calculator.Operation.DIVIDE));
        System.out.println(calculator.calculate(100, 50, Calculator.Operation.MULTIPLY));
    }
}
