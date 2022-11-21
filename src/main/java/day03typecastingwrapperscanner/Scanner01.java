package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data almaya yarar ,Scanner kullanici ile etkileşim kurmamizi saglar.
    //Scanner bir java Class'idir , bu Class'i kullanabilmek icin "import" etmek gerekir.
    //Scanner Class'i java nin util kutuphanesindedir.



    public static void main(String[] args) {

        //Kullanicidan data almak icin yapilmasi gerekenler

        //1.Adim : scanner Class indan obj. olusturun

        Scanner input = new Scanner(System.in);

       //2.Adim : Kullaniciya ne yapacagini soyle

        System.out.println("Hey kullanici yasini gir..");

        //3. Adim : Kullanicidan aldiginiz datayi bir variable'nin icine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin" + age); // 23 yazalm

    }



}
