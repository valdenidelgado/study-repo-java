package b1000to1010;

import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.printf("SOMA = %d\n", sum);
        sc.close();
    }
}
