package b1010to1020;

import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int anos = idade / 365;

        idade -= anos * 365;

        int meses = idade / 30;

        idade -= meses * 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, idade);

        sc.close();
    }
}
