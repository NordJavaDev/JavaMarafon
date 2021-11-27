package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numb = new int[n];
        for (int i = 0; i < numb.length; i++) {
            Random random = new Random();
            numb[i] = random.nextInt(10);
        }

        int moreEight = 0;
        int equalsOne = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;

        for (Integer x : numb) {
            sum += x;
            if (x > 8) {
                moreEight++;
            }
            if (x == 1) {
                equalsOne++;
            }
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(numb));
        System.out.println("Длина массива: " + numb.length);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

/**
 * При изучении материала и используя дополнительную литературу, я изучил решение с помощью Arrays.stream().filter
 * Мне показалось очень удобным вариантом.
 * <p>
 * int sum = Arrays.stream(numb).sum();
 * long moreEight = Arrays.stream(numb).filter(i -> i > 8).count();
 * long equalsOne = Arrays.stream(numb).filter(i -> i == 1).count();
 * long even = Arrays.stream(numb).filter(i -> i % 2 == 0).count();
 * long odd = Arrays.stream(numb).filter(i -> i % 2 != 0).count();
 * <p>
 * System.out.println(Arrays.toString(numb));
 * System.out.println("Длина массива: " + numb.length);
 * System.out.println("Количество чисел больше 8: " + moreEight);
 * System.out.println("Количество чисел равных 1: " + equalsOne);
 * System.out.println("Количество четных чисел: " + even);
 * System.out.println("Количество нечетных чисел: " + odd);
 * System.out.println("Сумма всех элементов массива: " + sum);
 */

