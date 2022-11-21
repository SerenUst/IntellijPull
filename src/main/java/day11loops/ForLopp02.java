package day11loops;

public class ForLopp02 {
    public static void main(String[] args) {

        //Bir string de ki m karakteri haric tum karakterleri yazdiriniz.
        //Andromeda ==> Androeda

        String str = "Andromeda";

                for(int i=0; i<str.length(); i++){

                    char c=str.charAt(i);

                    if(c!='m'){
                        System.out.println(c);
                    }
                }

            //2.yol : madam

        for(int i=0; i<str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'm') {

                continue; // bosverrrr demek==>Loop'un içinde bazi degerlerin calısmamasını istersek "continue" kul.
            }
            System.out.println(c);

        }
        System.out.println();
        //Example 2 : 1'den 100'e kadar 6 ile bolunenler haric tum tamsayıları ekrana yazdırınız


        for(int i=1 ; i<101 ; i++){
            if(i%6==0){

                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
       //Example 3: Size verilen bir string deki 'm' den onceki karakterleri yazdırınız.


       // Luxemburg   ==>  Luxe
        String s ="Luxemburg";

          for(int i=0; i<s.length(); i++){

              char c = s.charAt(i);

              if(c=='m'){
                  break;
              }
              System.out.print(c);
          }














    }
}
