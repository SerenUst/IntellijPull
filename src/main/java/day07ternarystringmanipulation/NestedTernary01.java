package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Verilen yılın "leap "year " (artık yıl)  olup olmadıgını kontrol eden kodu yazınız.
         i ) yıl 100 e bolunurse 400 e de boluneblr
         ii) yıl 100 e bolunmezse 4 e bolunmelidir.

         */

       int year =1600;
       String leap =  year %100 == 0 ? (year%400 == 0  ? "leap year " : "leap year degil ") : (year%4 ==0 ? "leap year" : "leap year degil");

        System.out.println(leap);

         /*
        Asagıdaki kurallara göre password un gecerli olup olmadıgını kontrol eden kodu yazınız
        i) sekiz karakterden fazla veya sekiz  karakter varsa ilk harfi 'i' olamlıdır
        ii) sekiz karakterden az karakter varsa ilk harfi 'K' olmalıdır
        */

        String pwd ="i2a3ed54";

        String gecerli =pwd.length()<8 ? (pwd.charAt(0) == 'K' ? "GECERLİ" : "GECERSİZ") : (pwd.charAt(0) == 'i' ? "gecerli" : "gecersiz") ;

        System.out.println("gecerli");




    }
}
