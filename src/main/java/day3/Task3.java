package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (count < 5) {

                double div = sc.nextDouble();
                double div2 = sc.nextDouble();
            count++;
                if (div2 == 0) {
                    System.out.println("Деление на 0");
                    continue;
                }
                    System.out.println(div/div2);

        }
    }
}

