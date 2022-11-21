package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {

       // note:Arrays'lerin icine  primitive data type' leri ve reference (adres) lar konabilir.


        String str[] = new String[3];
        str[0] ="java";
        str[1] ="did";
        str[2] = "surprised you";

        System.out.println(str);


     //ex1 : String bir Array olusturunuz .Tom ve tom dan onceki tum elemanları ekrana yazdırınız.

        String arr[]={"jane" , "Mark", "Christoper", "Tom", "Rojda"};

        for(String w: arr){

            System.out.println(w + " ");

            if(w.equals("Tom")){
                break;

            }

        }
        System.out.println();
 //EX2: sTRİNG BİR ARRAY OLUSTURUNUZ "TOM"VE "JANE" HARİC TUM ELEMANLARI EKRANA YAZDIRINIZ

        String brr[] = {"Jane", "Mark","Christoper", "Tom","Ali","Rojda" };
        for(String w:brr){

            if(w.equals("jane") || w.equals("Tom")){
                continue;
            }
            System.out.println(w + " ");
        }
        System.out.println();

           //EXAMPLE 3 :
        // Bir ogretmenin sınıfındaki ogrencilerin isimlerini app 'a yuklemesini saglayan kodu yazınız
       // Kullanıcı ile beraber bir array olusturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");



        for(int i=1; i<=numOfStd; i++){
            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");

            String stdName = input.next();


            if(stdName.equalsIgnoreCase("Q")){
                break;
            }

            names[i-1] = stdName;

        }
        System.out.println(Arrays.toString(names));



























    }
}
