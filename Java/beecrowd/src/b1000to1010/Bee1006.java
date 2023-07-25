package b1000to1010;

import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double average = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", average);
        sc.close();
    }
}
