package day22inheritancepolymorphism;

public class HondaAccord  extends Honda {
/*

1)Siz Class olusturdugunuzda java otomatik olarak size goprunmez bir constructor verir,
 cunku java class'in bir kalıp old ve object olusturmak icin yaratıldıgını  ve object olusturmak icin constructor'ın
 sart oldugunu bilir.

 2) Java otomatik olarak olusturdugu bu gorunmez constructor'a  "default constructor" denir

 3) siz kendiniz herhangi bir constructor olusturdugunuzda java "DEFAULT CONSTRUCTOR"İ SİLER.

 4) Bir Class'da birden fazla constructor olabilir. Fakat bu constructor'ların parametre'lerri farklı olmalıdır.

       5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
          "this.price" syntax'i constructor'larin icinde kullanilir.
        6)Conctructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
          Class daki variable degerlerini degistiremez...

 */

    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccord() {

    }

    public HondaAccord(int price) {
        this.price = price;

    }


    public HondaAccord(int price, int year) {

        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make=make;
        this.model=model;


    }
}