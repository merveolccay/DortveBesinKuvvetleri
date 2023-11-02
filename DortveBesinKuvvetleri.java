package java101;
import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı değeri giriniz: ");
        int sayi = inp.nextInt();


        System.out.println("4ve 5'in kuvvetleri: ");
        for (int i = 0; i <= sayi; i++) {
            int kuvvet4 = (int) Math.pow(4, i);
            int kuvvet5 = (int) Math.pow(5, i);
            System.out.println("4^" + i + " = " + kuvvet4);
            System.out.println("5^" + i + " = " + kuvvet5);
        }
    }
}

