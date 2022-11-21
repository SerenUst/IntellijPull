package day06nestedififswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
        Kullanıcıya ay ismi sorunuz ve kullanıcının verdigi ay isminden son aya kadar elrana yazdrnz
         */


       //Note:toLowerCase () methodu bir String'deki tum character'leri kucuk harfe cevirir.

       //    toUpparCase() methodu bir string'deki tum character 'leri buyuk harf yapar.




        Scanner input =new Scanner(System.in);
        System.out.println("Ay ismini giriniz");

         String ayIsmı =input.next().toLowerCase();


           switch(ayIsmı){
               case"ocak":
                   System.out.println("ocak");
               case"subat":
                   System.out.println("subat");
               case"mart":
                   System.out.println("mart");

               case"nisan":
                   System.out.println("nisan");

               case"mayıs":
                   System.out.println("mayıs");

               case"haziran":
                   System.out.println("haziran");
               case"temmuz":
                   System.out.println("temmuz");
               case"agustos":
                   System.out.println("agustos");
               case"eylül":
                   System.out.println("eylül");
               case"ekim":
                   System.out.println("ekim");
               case"kasım":
                   System.out.println("kasım ");
               case"aralık":
                   System.out.println("aralık");
                  break;
               default:
                   System.out.println("gecerli ay ismi giriniz");




           }





    }
}
