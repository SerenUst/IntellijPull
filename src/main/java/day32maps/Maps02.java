package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {


        //Size verilen bir kelimede kullanılan harflerin kacar kere kullanıldıgını gosteren kodu yazınız.
        //abbcaa ==> a=3 , b=2,c=1


        String kelime="abbcaa";

        HashMap<String, Integer> gorunum = new HashMap<>();
        String [] harfler =kelime.split("");
        System.out.println(Arrays.toString(harfler));//[a, b, b, c, a, a]

        for(String w : harfler ){

            Integer gorunumsayisi = gorunum.get(w);

            if(gorunumsayisi==null) {
                gorunum.put(w, 1);

            }else{
                gorunum.put(w,gorunumsayisi + 1 );
            }
        }









    }
}
