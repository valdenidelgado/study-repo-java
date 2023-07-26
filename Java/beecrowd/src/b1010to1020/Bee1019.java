package b1010to1020;

import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seconds = sc.nextInt();

        int hours = seconds / 3600;

        seconds -= hours * 3600;

        int minutes = seconds / 60;

        seconds -= minutes * 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

        sc.close();
    }
}
