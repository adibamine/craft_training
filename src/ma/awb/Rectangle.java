package ma.awb;

public class Rectangle {

    private double Width;
    private double height;

    public Rectangle(double width, double height) {
        this.Width = width;
        this.height = height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}