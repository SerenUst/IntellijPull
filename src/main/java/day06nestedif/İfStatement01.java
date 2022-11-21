package day06nestedif;

import java.util.Scanner;

public class İfStatement01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin  hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        // 0-4 =>bebek
        // 5-12=>cocuk
        // 13-20 =>genc
        // 21_30=>yetiskin
        // tanımlanmamıs evre

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");
        byte yas= input.nextByte();

        if(yas<0){
            System.out.println("gecerli yas giriniz");
        }else if(yas<=4){
            System.out.println("bebek");
        }else if(yas<=12){
            System.out.println("cocuk");
        }else if(yas<=20){
            System.out.println("genc");
        }else if(yas<=30){
            System.out.println("yetiskin");
        }else{
            System.out.println("tanımlanmamis evre");
        }



    }
}
