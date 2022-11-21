package day06nestedififswitch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {


//Example 1 : Kullanıcıcdan gun sayısısnı alınız ve gun ismini ekrana yazdırınız.
       // 1==>Pazar 2==>pazartesi

        Scanner input = new Scanner(System.in);
        System.out.println("gun nosunu girinz");
        byte gunNo= input.nextByte();

 // 1. yol:if ile cozunuz

        if( gunNo == 1 ) {

            System.out.println("pazar");
        }else if( gunNo ==2 ) {

            System.out.println("pazartesi");
        }else if( gunNo == 3 ) {

            System.out.println("salı");
        }else if( gunNo == 4 ) {

            System.out.println("carsamba");
        }else if( gunNo == 5 ) {

            System.out.println("persembe");
        }else if( gunNo == 6 ) {

            System.out.println("cuma");
        }else if( gunNo == 7 ) {

            System.out.println("ctesi");
        }else{
            System.out.println("gecerli gun nosu giriniz");
        }

         // 2.yol : switch ile cozunuz

        switch(gunNo){

            case 1 :
                System.out.println("pazar");
                break;
            case 2 :
                System.out.println("pazartesi");
                break;
            case 3 :
                System.out.println("salı");
                break;
            case 4 :
                System.out.println("carsamba");
                break;
            case 5 :
                System.out.println("persembe");
                break;
            case 6 :
                System.out.println("cuma");
                break;
            case 7 :
                System.out.println("cumartesi ");
                break;

            default:
                System.out.println("gecerli gun sayısı giriniz");




        }

    }
}
