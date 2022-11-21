package day18arraylistspassbyvalue;

import com.sun.jdi.PathSearchingVirtualMachine;

public class PassByValue01 {
    /*

    1) Java variable'ın orjinal degerlerini korumak ister.
    2) Variable method'lar icinde kullanıldıgında . Java method'un icine orjınal degerini koymaz,o degerin kopyasını
    uretir ve method'a o kopyayi yollar.Method kopya ustunde degisiklik yapar dolayısıyle varıeble'ın orjınal degeri
    korunmus olur.
    Bu sısteme "Pass By Value" denir.

    not: Java "Pass By Value" kullanır
    note: Bazı programlama dilleri orjinal degeri koruma altına almamıstır bu işi developerlere bırakmıstır.
    Bu tarz diller "Pass By Reference" kullanır.

     */

    public static void main(String[] args) {

        int x = 5;//Gomlek                      //Java orjinal değeri korur.

        System.out.println(x);//5

        //static method olan "main" un içindeki herşey static olmalıdır.

        change(x);//Ogrenci gomleği
        System.out.println(x);//Gomlek

        int ucret = 100 ;

        int kopya = indirim(ucret);    //Bunların yerine  ucret = indirim(ucret) yazılırsa orjinal değer değişir.
        System.out.println(kopya);     //

        System.out.println(ucret);


    }

    public static void change(int a){//void olduğu için return kullanmadık

        System.out.println(a*3);

    }
    //void dışındaki "return" type larda method body si içinde "return" keyword kullanılmalıdır.

    public static int indirim(int gomlekUcreti){

        return gomlekUcreti - 10;



    }


    }
