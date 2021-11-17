package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        if(numb > 0 && numb <= 4) {
            System.out.println("Малоэтажный дом");
        }
        else if(numb > 4 && numb <=8){
            System.out.println("Среднеэтажный дом");
        }
        else if(numb >= 9){
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
}
