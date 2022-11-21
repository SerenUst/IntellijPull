package day07ternarystringmanipulation;

import java.sql.SQLOutput;

public class Ternary01 {
    public static void main(String[] args) {

        //EXM: Bir sayının pozıtıf mi olup olmadıgını  ekrana yazdrnz

        //1.way :if-else

        int a= -12;
        if(a>0){
            System.out.println("pozitif");
        }else{
            System.out.println("pozitif değil");
        }


        //2.yol : ternary

              // Condition  ? condition dogru ise uygulanacak kod   : condition yanlış ise uyg. kod


         String sonuc =  a>0 ?         "pozitif"                     :       "pozitif degil" ;

        System.out.println(sonuc);



        //exp: iki sayıdan kucuk olanı secen kodu yaznz

        int b= 12;
        int c=23;

      int min  =  b<c  ?   b : c  ;

        System.out.println(min);


        //EX 3 : VERİLEN BİR SAYININ MUTLAK DEGERİNİ HESAPLAYAN KODU YAZINIZ

         //    POZİTİF SAYILARIN VE SIFIRIN MUTLAK DEGERİ KENDİLERİDİR
        // NEGATİF SAYILARIN  MUTLAK DEGERİ -1 İLE CARPILMIŞ HALLERİDİR.

        int d = -45 ;

         int abs =  d<0  ?  -1*d  :  d ;

        System.out.println(abs);

//exp 4 : iki tane sayı aynı işaretli ise bu sayıları carpınız , farklı isaretli ise "islem yapamam " mesajı veriniz

        int e  =12;
        int f = 10;
       // Ternary farklı data tiplerinde sonuc return ederse sonucun data tipini " Object" yapınız.

        Object islem = (e>0 && f>0  ) || ( e<0 && f<0) ? e*f : "islem yapamam";

        System.out.println(islem);

        // note: java da her class ın en az bir tane "parent " class ı  vardır. // parent : aile anlmnda-anne baba gbi
       // Sadece "object" class'ın parent class'ı yoktur.




    }
}
