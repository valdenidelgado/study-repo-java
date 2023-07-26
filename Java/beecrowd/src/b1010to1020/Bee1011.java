package b1010to1020;

import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double volume = (4.0 / 3) * PI * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }
}
