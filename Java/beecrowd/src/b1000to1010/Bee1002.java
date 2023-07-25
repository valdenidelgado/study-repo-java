package b1000to1010;

import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double area = PI * Math.pow(r, 2);

        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}
