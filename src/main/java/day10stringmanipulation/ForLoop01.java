package day10stringmanipulation;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Ekrana 5000 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin "loop" kullaniriz
        //Dort cesit "loop" vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        //  Baslangic degeri Loop hangi sart altinda calisacak Increment(Artirma) veya Decrement(Azaltma)
        for (int i = 1; i < 6; i = i + 1) {
            System.out.println("Hi");
        }

        //Example 3 : 4 den 7 e kadar tum tamsayıları ekrana yazdıran kodu yazınız.

        for (int i = 4; i < 8; i = i + 1) {

            System.out.println(i);

        }
        //*****
        for (int i = 4; i < 8; i = i + 1) {
            System.out.print(i + " ");
        }


        //Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz


        for (int i = 14; i > 4; i--) {

            System.out.print(i + " ");
        }


        //  Example 5 :  14 ten 5e kadar tum cift sayıları yazdırınız

        //1.yol:
        for (int i = 14; i > 4; i -= 2) {

            System.out.print(i + " ");// 14 12 10 8 6
        }

        // 2. yol :

        for (int i = 14; i > 4; i -= 2) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

        //EX 6 : 28 DEN 157 E KADAR TUM TEK SAYILARI EKRANA YAZDIRAN KODU YAZINIZ

        for (int i = 29; i < 158; i++) {
            if ((i % 2) != 0) {
                System.out.print(i + " ");
            }
        }

        //EXAMPLE 7 : "java" String'ini "J*a*v*a" Stringine ceviren kodu yazınız .
        String str = "Java";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }
//Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
//           "Hellooo Ali" ==> He Ai
        String s = "Hellooo Ali";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);//He Ai


            }

        }

    }





}
