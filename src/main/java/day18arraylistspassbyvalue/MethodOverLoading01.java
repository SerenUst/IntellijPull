package day18arraylistspassbyvalue;

public class MethodOverLoading01 {
    /*
method overloading nasil yapilir???

1. method isimleri ayni olmalidir
2. method parametreleri farkli olmalidir.
   i) Parametre ayilari degishtirilebilir.
   ii) Parametrelerin data type'larini degishtirebiliriz
   iii) Parametrelerin yerlerini dgégishtirebilirsiniz ancak
   data type'lari farkli ise

   3. Method ismi + parametreler = Method Signature//imza demek.
    Method Signature dısında ne degiştiriseniz degistirin java o methodları farklı kabul etmez
 */

    public static void main(String[] args) {
add(3,5);

add(3,5.0);



    }
    public static void add(int a, int b) {

        System.out.println(a + b);//8
    }

    public static void add(int a, int b, int c) {

        System.out.println(a + b + c);
    }

    public static void add(int a, double b) {

        System.out.println(a + b);
    }

    public static void add(double a, int b) {

        System.out.println(a + b);

    }

}