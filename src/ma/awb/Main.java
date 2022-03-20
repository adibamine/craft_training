package ma.awb;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(100, 50, new AddOperation()));
        System.out.println(calculator.calculate(100, 50, new SubtractOperation()));
        System.out.println(calculator.calculate(100, 50, new DivideOperation()));
        System.out.println(calculator.calculate(100, 50, new MultiplyOperation()));
    }
}
