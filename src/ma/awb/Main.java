package ma.awb;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(7);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.Area(new Shape[]{rectangle, circle}));
    }
}
