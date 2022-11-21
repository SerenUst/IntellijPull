package day02methodcreation;

public class MethodCreation {

    // Main method içinde kullanacaginiz hersey "static" olamalidir.
    public static void main(String[] args) {

    System.out.println(toplamaYap(1.2,5));

        System.out.println(ucSayiyiCarp(2,1.5,6));

        System.out.println(ıslemYap(5,2,3));

        //sout yazip "Enter" a basiniz. System.out.println() otomatik olarak yazilir.
        // Ekrana bir sey yazdirmak icin iki tane kod var i) System.out.println()==>Satirbasi yapar
        // ii)System.out.print() ===> Satirbasi yapmaz.





    }

    // Example 1: Toplama işlemi yapan bir method oluşturunuz
    public static double toplamaYap (double a, double b){
       return a+b;
    }

 // Example 2: üç sayıyı birbiri ile carpan  bir method oluşturunuz

      public static double ucSayiyiCarp(double a,double b,double c){
        return a*b*c;
}

    // Example 3: uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup,sonucu yazdiriniz

       public static double ıslemYap(double a,double b,double c) {

        return (a+b)*c;}



}


