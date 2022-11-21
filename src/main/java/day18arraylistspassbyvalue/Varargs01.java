package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
    1)Farklı sayılardaki parametrelerle calısabilen bir method olusturmak isterseniz "varargs" kullanmalısınız

    2)"Varargs" arka tarafta "array" kullanır, bu yuzden "varargs"larla calısırken "Array"lerle calısıyormus gibi
    davranabilirisniz

    3) "Varargs" olusturmak ıcın "<data type>... <varargs ismi>"
    4)Bir method da "varargs" ın yanında baska bir parametre kullanılabilr mi?

    5) Bir method da birden fazla "varargs" kullanılabilir mi?
    "varags" en sonda olmak zorunda oldugundan , birden fazla kullanırsanız en az biri en son da olmayacaktr.
     Bu da 4. kural ile celişir.


     */



    public static void main(String[] args) {

        int r1 = toplama(2, 3);
        System.out.println(r1);

        int r2 = toplama(2, 3, 4 );
        System.out.println(r2);

    }

        //    //iki sayinin toplamini return eden bir method olusturunuz..
//
//    public static int toplama(int a, int b ){
//       return a+b;
//    }
//    //uc sayinin toplamini return eden bir method olusturunuz..
//    public static int toplama(int a, int b, int c ){
//        return a+b+c;
//    }
//    //dort sayinin toplamini return eden bir method olusturunuz..
//    public static int toplama(int a, int b, int c, int d ){
//        return a+b+c+d;
//    }
//
//    //// Istedimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
//    // ...a  varargs denir... varargs in arkasina array calisir...

    public static int toplama(int...a){

        int sum = 0;
        for (int w : a ) {
            sum = sum+w;
        }
        return sum;







    }
}