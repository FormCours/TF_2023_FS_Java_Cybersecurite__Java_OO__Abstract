package models;

public class Square extends Rectangle {

    public Square(String color, double size) {
        super(color, size, size);
    }

    private void setSize(double size) {
        super.setHeight(size);
        super.setWidth(size);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }
}
