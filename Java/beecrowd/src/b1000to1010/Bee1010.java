package b1000to1010;

import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idProduct1 = sc.nextInt();
        int numberUnits1 = sc.nextInt();
        double priceUnit1 = sc.nextDouble();

        int idProduct2 = sc.nextInt();
        int numberUnits2 = sc.nextInt();
        double priceUnit2 = sc.nextDouble();

        double totalValue = numberUnits1 * priceUnit1 + numberUnits2 * priceUnit2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue);
        sc.close();
    }
}
