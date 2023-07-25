package b1000to1010;

import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        double average = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", average);
        sc.close();
    }
}
