package b1010to1020;

import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();

        double consume = a / b;

        System.out.printf("%.3f km/l\n", consume);

        sc.close();
    }
}
