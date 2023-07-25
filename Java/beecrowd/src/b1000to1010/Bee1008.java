package b1000to1010;

import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idEmployee = sc.nextInt();
        int numberHours = sc.nextInt();
        double valuePerHour = sc.nextDouble();

        double salary = numberHours * valuePerHour;

        System.out.printf("NUMBER = %d\n", idEmployee);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        sc.close();
    }
}
