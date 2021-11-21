package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numb = new int[100];
        for(int i = 0; i < numb.length; i++){
            Random random = new Random();
            numb[i] = random.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int wN = 0;
        int sumN = 0;
        for(Integer x : numb){
            if(x > max){
                max = x;
            }
            if(x<=min){
                min = x;
            }
            if(x % 10 == 0){
                wN++;
                sumN +=x;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(wN);
        System.out.println(sumN);
    }
}
