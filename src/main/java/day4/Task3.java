package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];

        int sumInLine = 0;
        int ind = 0;
        for (int i = 0; i < matrice.length; i++) {
            int sum = 0;
            Random random = new Random();
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(50);
                System.out.print(matrice[i][j] + " ");
                sum += matrice[i][j];
            }
            System.out.println();

            if (sum >= sumInLine) {
                sumInLine = sum;
                ind = i;
            }
        }
        System.out.println();
        System.out.println(ind);
    }
}
