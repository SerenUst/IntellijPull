package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

     //Example 1 : Sayilari kullanicidan alan ve toplama islemi yapankodu yaznz?

        //1.Adim : Scanner Claa indan obj olstr.

        Scanner input = new Scanner(System.in);

   //2.Adim: kullanıcıya ne yapacagını soyle

        System.out.println("Ilk sayiyi 33giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("Ikıncı sayiyigiriniz..");
         double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);



    }
}
