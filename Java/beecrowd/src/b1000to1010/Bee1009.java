package b1000to1010;

import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sell = sc.nextDouble();

        double total = salary + sell * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);
        sc.close();
    }
}
