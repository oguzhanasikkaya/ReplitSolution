package OOP.SquareInheritance;

public class Square {
    private double length;

    public Square(double length) {
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double circumferenceCalc(){
        return 4* length;
    }


}
