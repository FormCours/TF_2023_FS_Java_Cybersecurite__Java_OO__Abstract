package models;

public abstract class Form {

    private String color;

    public Form(String color) {
        setColor(color);
    }

    private void setColor(String value) {
        this.color = value;
    }
    public String getColor() {
        return color;
    }

    public abstract void draw();
}
