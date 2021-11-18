package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            double div = sc.nextDouble();
            double div2 = sc.nextDouble();
            if (div2 == 0)
                break;

            System.out.println(div/div2);
        }
    }
}
