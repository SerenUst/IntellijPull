package day04ifstatement.day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
    Iki tane String'in birbirine esit olup olamdıgını anlamak icin "==" degil , "equals()" kullaniniz.

    Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilir
    İ) eguals() ==> Buyuk harf ve kucuk harfi önemser. "A" ile "a" farklidir
    İİ)equalsIgnoreCase() ==> Buyuk harf ve kucuk harfi önemsemez. "A" ve "a" aynidir

     */

    public static void main(String[] args) {

        //Example 1 : Kullanicidan gun isimlerini aliniz o gunun hafta ici mi hafta sonu mu oldugunu kullaniciya soyleyiniz.

        // pazartesi==>Haftaici        pazar==>Haftasonu

        Scanner input = new Scanner(System.in);

        System.out.println("Bir gün ismi giriniz");

        String gun = input.next();

        if(gun.equalsIgnoreCase("pazar")){
            System.out.println("Hafta sonu ..");
        }else if(gun.equalsIgnoreCase("pazartesi")){
            System.out.println("Haftaici");
        }else if(gun.equalsIgnoreCase("sali")){
            System.out.println("Haftaici");
        }else if(gun.equalsIgnoreCase("carsamba")){
            System.out.println("Haftaici");
        }else if(gun.equalsIgnoreCase("persembe")){
            System.out.println("Haftaici");
        }else if(gun.equalsIgnoreCase("cuma")){
            System.out.println("Haftaici");
        }else if(gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Haftasonu");
        }else{
            System.out.println("Gecerli bir gun giriniz");
        }


         // 2. yol :
         if(gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi")){
             System.out.println("Hafta sonu ");
         }else if(gun.equalsIgnoreCase("pazartesi") ||
                 gun.equalsIgnoreCase("sali") ||
                 gun.equalsIgnoreCase("carsamba")||
                 gun.equalsIgnoreCase("persembe") ||
                 gun.equalsIgnoreCase("cuma")){
             System.out.println("Hafta ici ");
         }else{
             System.out.println("Gecerli bir gun ismi giriniz...");
         }

         //3.yol :
      boolean haftasonu =  gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi");

         boolean haftaici =
                 gun.equalsIgnoreCase("pazartesi") ||
                 gun.equalsIgnoreCase("sali") ||
                 gun.equalsIgnoreCase("carsamba")||
                 gun.equalsIgnoreCase("persembe") ||
                 gun.equalsIgnoreCase("cuma");

        if(haftasonu){
            System.out.println("Hafta sonu ");
        }else if (haftaici ) {
            System.out.println("hafta ici.");
        }   else {
            System.out.println("Gecerli bir gun ismi giriniz..");
        }



    }
}
