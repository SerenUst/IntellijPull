package day01variables;

public class Variables01 {


//Variables nasıl oluşturulur?

    //1) Access Modifier   2) Data type  3)Variable ismi  4) =  5) Deger  6)  ;
     public int age = 13;
    // Java'da ";" Ingilizce'deki "." gibidir.
    // Ingilizce'de "cümle" deriz,Java'da "statement" deriz.

     // "=" sembolü "Assignment (Atama) Operator" olarak adlandirilir
     // "Assignment (Atama) Operator" olarak adlandırılır.


     public int height = 183;

                        //  Java'da Data Tupe'ları

   /*
                        PRİMİTİVE DATA TYPES ( turkcesi ilkel )


        1) İnt : integer'in kısaltması : Integer tam sayı demektir .
        Matematik'de  tam sayıların başı ve sonu yoktur fakat Java da tamsa. başı ve sonu vardır.

        En küçük İnt = -2,147.483,648

        En buyuk İnt = 2,147,483,647

        2)byte : Tamsayılar için kullanlr.

        en kucuk byte = -128
        en buyuk byte = 127

        3) short : tamsayılar için
        En küçük short = -32768
        En buyuk short = 32767

        4) long : Tamsayılar içindir
         En küçük long : - 9,223,372,036,854,755,808
         En buyuk long : 9,223,372,036,854,755,807

         5) float : Ondalıklı sayılar içindir.
         "float" virguiden sonra 7basamak içereblr

           "float"  değerlerinde sona "f" veya "F" koymanız gerekir.



         6) double : Ondalıklı sayılar içindir.

             "double " virgülden sonra 16 basamak içerir .


         7) boolen : "true" veya "false"  degerleri için kullanılır. 1 bit kullanır.


          8) char : Tek karakterler için kullanılır . 16 bit kul.

             A, c, 2, ?, =

             NOTE: CHAR LARA DEGER VERRKEN , DEGERİ TEK TIRNAK ARASINA KOYUNUZ.

             NOYE: Java buyuk ve küçük harflere duyarlıdır .

                 Java için  " TRUE" ile true tamamen farklıdır .

                 note: Numerıc Data Types :  byte<short< int < long <float <double

                   Numerıc olmayan Data Types : boolen - char



                        Non -Primitive  Data Types

        string ; isim,adres,kimlik numarası gibi bir veya birden fazla karakter içeren degerlerde kullanılır.

          String değerleri mutlaka çift tırnak arasına konulmalıdır.
          string non- primitive'dir. Yani bir string oluşturdugumzda java size bir sürü method verir.


          Primitive ile Non-Primitive farkı :
      1) Non Primitive data tupr'lerinde degerin yanında method'lar vardır.
      primitive data type'larında ise sadece deger vardır ,method yoktur.

      2) Primitive data type'lari Java tarafından oluşturulur. Toplam 8 tanedir. Biz primitive data oluşturamayız.
      Non- Primitive data type'ları Java tarafından oluşturulmuştur. Biz de olulturabiliriz.
      Non primiteve ler sayılamayacak çoktur çünkü her her developer Non-primitive data type oluşturabilir.

      3) Primitive data type isimleri küçük harfle başlar
       Non-primitive data type isimleri buyuk harfle başlar.

       4)Primitive data type'lar memory'de farklı buyuklukte yerler kullanır.
       Non-primitive'lerin hepsi memory'de aynı büyüklükte yer kullanırlar.

    */

   public byte price = 12;

   public short populationOfVillage = 23000;

   public float priceOfShirt = 13.99F;

   public double weightOfCell =0.000012045;

     // siz "Long" demenize ragmen verilen sayıyı  "int" kabul eder.
      // Bu yuzden , Long bir variable 'a  "int" aralıgı dısında bir sayı verirseniz mutlaka
    // sonuna "L" veya "l" koyunuz


      public long populationOfWorld =7000000000L;

       // Burada  "L" koymadıgımız halde problem yok cunku "1234" int aralıgına uyar .

       public long x = 1234;

       public boolean isOld = true;

       public boolean isRich = false;

        public char initial = 'S';

     public String name = "Tom Hanks";

// NOTE :  "main method" arabanın motoru gibidir.
         // "Main method" calısmadan hiçbirsey calısmaz .



}