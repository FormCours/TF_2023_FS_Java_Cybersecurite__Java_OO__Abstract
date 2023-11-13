package models;

public class Rectangle extends Form {

    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);

        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle de " + height + " sur " + width + ".");
    }
}
