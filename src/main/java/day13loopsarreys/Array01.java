package day13loopsarreys;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class Array01 {
    public static void main(String[] args) {

/*
       Note:

        1) Aynı data tipinde , coklu data 'ı depolamak için java nın oluşturdugu yapılar vardır
        Bu yapılardan birisi de "ARRAY" lerdir.

 */


        //Array nasıl olusturulur ?
       int stdAges[]= new int[7]; // [0,0,0,0,0,0,0 ]


        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Array lere elemanlar nasıl eklenir ?

        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;

     //   12  11 13 14 10 12 12
     //    0   1  2  3  4  5  6

        System.out.println(Arrays.toString(stdAges));   //[0,11,0,0,0,0,0]

        //Array 'deki herhangi bir elemani nasıl yazdırabiliriz?

        System.out.println(stdAges[4]);//10

        //ARRAY'DE Kİ  EN KUCUK VE EN BUYUK ELEMANI EKRANA YAZDRN

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10,11,12,12,12,13,14]

        int ilk=stdAges[0];
         // Note: "lenght()" String'lerde kullanılır."lenght" Array'lerde kullanılır.
        int son =stdAges[stdAges.length-1];

        System.out.println(ilk+son);//24


        //Example 2: stdAges Array'i icindeki tum elemanların toplamını ekrana yazdıran kodu yazınız.

        //1.yol:

        int sum =0;

        for(int i=0; i<stdAges.length; i++){

            sum=sum+stdAges[i];
        }

        System.out.println(sum);


        //2.yol : while-loop

         int i =0;
         int toplam=0;

         while(i<stdAges.length){

             toplam=toplam +stdAges[i];

             i++;
         }

        System.out.println(toplam );


       //3.yol: do-while-loop

        int k=0;

        int s=0;

        do{
            s=s+stdAges[k];

            k++;
        }while(k<stdAges.length);

        System.out.println(s);


        //4.yol:for each loop Array lerde ve collectıons larda kullanılır.

        int t=0;


        for(int w : stdAges){

            t=t+w;

        }
        System.out.println(t);


        //Example 3: String bir array olusturunuz
//           Bu Array'e 5 tane isim yerlestiriniz
//           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz



         String stdNames[] = new String[5];

         stdNames[0] = "ALİ";
         stdNames[1] = "TOM";
         stdNames[2] = "VELİ";
         stdNames[3] = "KEMAL";
         stdNames[4] = "CEM";

          int karakterSayilariToplami= 0;

          for(String w: stdNames){

             karakterSayilariToplami= karakterSayilariToplami + w.length();

          }

        System.out.println(karakterSayilariToplami);//18

     System.out.println();
        //Example 4: cHAR BİR ARRAY OLUŞTURUN BU ARRAYE 5 ELEMAN EKLEYN
     //BU ARRAY DEKİ SADECE BUYUK HARFLERİ EKRANA YAZIN

     char ch[] = { 'A', 'c','D','k','M'};

     for(char w: ch){

      if(w>='A'&& w<='Z'){

       System.out.println(w);
      }
     }







    }
}
