package ma.awb;

public class Calculator {

    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }


    public double calculate(double numA, double numB, Operation operation) {

        double result = 0;

        switch (operation) {

            case ADD:
                AddOperation addOp = new AddOperation();
                result = addOp.add(numA, numB);
                break;
            case SUBTRACT:
                SubtractOperation subOp = new SubtractOperation();
                result = subOp.subtract(numA, numB);
                break;
            case MULTIPLY:
                MultiplyOperation multOp = new MultiplyOperation();
                result = multOp.multiply(numA, numB);
                break;
            case DIVIDE:
                DivideOperation divOp = new DivideOperation();
                result = divOp.divide(numA, numB);
                break;

        }

        return result;

    }
}