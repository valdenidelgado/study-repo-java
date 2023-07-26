package b1010to1020;

import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100, 50, 20, 10, 5, 2, 1};
        int cedulas = sc.nextInt();
        System.out.println(cedulas);
        for (int cedula : arr) {
            int qtdCedulas = cedulas / cedula;
            System.out.printf("%d nota(s) de R$ %d,00\n", qtdCedulas, cedula);
            cedulas -= qtdCedulas * cedula;
        }

        sc.close();
    }
}
