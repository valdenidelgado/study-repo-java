package b1010to1020;

import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double distance = (double) (a * b) / 12;

        System.out.printf("%.3f\n", distance);

        sc.close();
    }
}
