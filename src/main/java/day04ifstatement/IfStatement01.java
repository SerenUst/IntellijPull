package day04ifstatement;

import java.sql.SQLOutput;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        // if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar .

 // Example 1 : Sayi pozitif ise ekrana pozitif yazdirin.

        int s = 12;


        if(s>0){
            System.out.println("positive");

        }

// ex 2: Verilen karakter büyük harf ise ekrana büyük harf yazdırın

        char ch = 'V' ;
        if(ch>='A' && ch<='Z'){

            System.out.println("buyuk harf");
        }

         /*
         && islemi sadece boolean ile kullanilir.
         true && true = true
         true&& false = false
         false && true = false
         false && false = false

         && islemi mükemmelliyetcidir. True sonucunu almak icin hersey true olmalidir.
         Bir tane false varsa sonuc false demektir.

          */

     //Example 3 : Verilen bir sayi uc basamakli ise ekrana uc basamakli yazdiriniz.

        byte abc = 110;// seren ornegi :)))

        if(abc>=100 && abc<=127); {

            System.out.println("uc basamaklidir");

        }

        // Hoca cozumune ;

        int n = 123;


        n= Math.abs(n); // -120 diyelim mutlak degerden 120 olur haliyle islemden gecer .




        if(n>=100 && n<=999){ //n>=100 && n<=999 veya n>99 && n<1000
            System.out.println("uc basamaklidir");

        }

      // Example 4 : Verilen bir sayi  cift sayi ise ekrana cift sayi yazdiriniz

        int p =-18;

        p= Math.abs(p);

        //Not: "=" isareti atama operatörüdür. matematikteki esittir anlamina gelmez
        //Matematikteki "=" sembolü java da "==" seklindedir.
        // 2+3==5 esitlik 2 tane == işareti ile oluyor


        if(p%2==0){
            System.out.println("cift sayi");

        }

      // Example 5 : Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika sayi" yazdirin

        int r= 250;

        if(r<300 || r>1200){

        }


        /*
           || islemi sadece boolean ile kullanilir.
                 true || true = true
                 true || false= true
                false || true= true
                false || false= false

          Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter


        */



    }
}
