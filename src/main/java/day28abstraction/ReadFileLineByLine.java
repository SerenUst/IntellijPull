package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
        "throw" ile "throws" arasındaki farklara nelerdir?

      1) "throw" method'un body'si içinde kullanılır. "throws" ise methodun isminden sonra kullanılır.

     2)  "throw" dan sonra obje olusturulur. "throws" dan sonra ise sadece Exception Class'in ismi yazilir.

     3)"throw" method'un icinde istedigimiz yerde Exception üretmek  icin kullanilir."throws" ise varolan checked
      Excepton'u atmak icin kullanilir.

     4)"throw" dan sonra sadece bir tane Exception olabilir.
      "throws" dan sonra 1 den fazla Exception olabilir.



 */




public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByLine();

    }

    public static void readFileLineByLine (){

        try {
            BufferedReader  br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));

            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }

            br.readLine();

        } catch (FileNotFoundException e) {
            System.out.println("ya path yanlış ya da dosya silinmiştir" + e.getMessage());
        } catch (IOException e) {
            System.out.println("okunamayacak character veya characterler var - " + e.getMessage());
        }


    }
}
