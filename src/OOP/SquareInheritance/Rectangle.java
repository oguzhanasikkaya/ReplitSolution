package OOP.SquareInheritance;

public class Rectangle extends Square{
    private double height;

    public Rectangle(double length, double height) {
        super(length);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double circumferenceCalc() {
        return 2* (getLength()+getHeight());
    }
}
