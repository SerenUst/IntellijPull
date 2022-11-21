package day10stringmanipulation;

public class WrapperClass01 {

    public static void main(String[] args) {
/*
        //Note: Java primitive'lere method'lar ekleyerek yeni bir yapi olusturdu , bu yapiya "Wrapper Class" denir.

          Primitive   Wrapper
               byte ==> Byte
               short==> Short
               **int==> Integer
               long ==> Long
               float==> Float
               double==>Double
               boolean==>Boolean
               **char==>Character

 */
        byte primitiveByte = 12;// "primitiveByte" yazip nokta koydugumuzda hic method göremeyiz cunku
        // primitive'ler hic method içermez sadece deger içerir.

        Byte wrapperByte = 12;// "wrapperByte"yazip nokta koydugumuzda bir çok method görürürz, cunku Wrapper'lar method içerir.


        // Example 1 : byte data type inin en kucuk ve en buyuk degerlerini yazdıırırnz

        System.out.println(Byte.MIN_VALUE);

        System.out.println(Byte.MIN_VALUE); // - 128
        System.out.println(Byte.MAX_VALUE); // 127

        //EXAMPLE 2 : short,int,long data type'lerini en buyuk ve en kucuk degerlerini ekrana yazın

        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE); //-32767

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647

        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Long.MIN_VALUE); //-9223372036854775808




        /*
            Note: Java primitive lere method'lar ekleyerek yeni bir
                  yapi olusturdu, bu yapiya "Wrapper Class"

                  Primitive         Wrapper
                     byte     ==>    Byte
                     short    ==>    Short
                     ** int   ==>    Integer
                     long     ==>    Long
                     float    ==>    Float
                     double   ==>    Double
                     boolean  ==>    Boolean
                     ** char  ==>    Character

        byte primitiveByte = 12;//"primitiveByte" yazip nokta koydugunuzda hic method goremezsiniz, cunku primitive'ler
        // method icermez sadece deger icerir
        Byte wrapperByte = 12;//"wrapperByte" yazip nokta koydugunuzda bir cok method gorursunuz, cunku "wrapper" lar
        // method icerir



        //Example 1: byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Example 2: short, int, long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807

        // "Primitive" ler naıl "wrapper" lara cevrilir. ( Autoboxing)


        float f1 = 13.99F;
        Float wrapperF1 = f1;


        // "wrapper"lar nasil "primitive"lere cevrilir(unboxing)

        Character w1 = 's';
        char primitiveW1 = f1;


        //Note: Autoboxing ve Unboxing java tarafından otomatik olarak yapilir.

         */
    }
}
