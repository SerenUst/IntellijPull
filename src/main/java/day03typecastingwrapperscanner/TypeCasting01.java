package day03typecastingwrapperscanner;

import java.util.Scanner;

public class TypeCasting01 {

    // Type Casting : Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.

    //   byte<short<int<long<float<double

   // Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir.
    //NOTE 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Norrowing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234L;
        int newPopulation = (int)population;

        //Example 1 : short'u double'a çeviren kodu yazınız ?

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents; // Auto widening

        //Example 2: float'ı byte yapan kod?

        float price = 12.99F;
        byte newPrice = (byte)price; // Explicit Narrowing

        System.out.println(newPrice); // 12 ===> Java ondalik sayiyi , tam sayiya cevirirken yuvarlama islemi yapmaz
                                      // java ondalik sayiyi , tam sayiya cevirirken ondalik kismini siler.


        int number = 515;

        byte newNumber = (byte)number;

        System.out.println(newNumber); // 3 (byte - 128...127 topla256 sayı var. 515/256 bolm:2kalan :3 yani sonuc 3

        //java 515 i 256(byte'daki sayıların toplamı )ya böldü kalanı return etti.

        int num = 510;

        byte newNum = (byte)num; // -2 // java 510 u 256 ya böldü kalan -2 dedi. bolum 2 dedi. bolum 1 deseydi kalan 254 idi
         // 254 byte yok yine . o yzden -2 yaptı .





    }


    public static class Scanner03 {

        public static void main(String[] args) {

            //Kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yazınız ?

            Scanner input = new Scanner(System.in);

            System.out.println("Dikdortgenin kısa kenarini giriniz..");

            int en = input.nextInt();

            System.out.println("Dikdortgenin uzun kenarini giriniz..");
            int boy =input.nextInt();

            System.out.println("Alan" +en*boy);

            System.out.println("Cevre" + 2*(en+boy));



        }
    }
}
