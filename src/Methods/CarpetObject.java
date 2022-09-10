package Methods;

import java.util.Scanner;

public class CarpetObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextBoolean());
        System.out.println(c.totalPrice());
    }

}
