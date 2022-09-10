package OOP.SquareInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Square s = new Square(in.nextDouble());
        Cube c = new Cube(in.nextDouble());
        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.getLength());
        r.setLength(in.nextDouble());
        System.out.println(r.getLength());
        System.out.println(s.getLength());
        System.out.println(s.circumferenceCalc());
        System.out.println(c.circumferenceCalc());

    }
}
