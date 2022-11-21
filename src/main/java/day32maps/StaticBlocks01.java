package day32maps;

public class StaticBlocks01 {
    public static double pi;

    static{
        System.out.println("Static blok 2 ");
    }



    public static void main(String[] args) {
        System.out.println("Main method");

    }


    //pi=3,14
    //static block'lar ihtiyacımız olan variable'ların class olusturma safhasında elimzde olmasını saglar.
    //static block'lar Calss içindeli herseyden once calıstırılır."main method"dan ve diğer tum method'lardan once calıstırılır.
    //static blok'lar içinde sadece "static variable"lere deger atanabilir.
    // 1 den fazla static blok varsa ustteki once calısıtırlır.



    static{
        pi=3.14;
        System.out.println("Static block 1");
    }


}
