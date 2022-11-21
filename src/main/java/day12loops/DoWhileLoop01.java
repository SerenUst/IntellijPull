package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

//while-loop icin loop body'si icindeki kodun hic calistirilmamam ihtimali vardır.

int i=1;
while(i<1){

    System.out.println("while loop");

    i++;
}

//do-while loop'un body'si icindeki kod her halikurda en az bir kere calisir.

      int k=1;

do{
    System.out.println("do-while-loop");

    k++;
}while(k<1);

// Example 1 : Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.

        // 24,5673 ===> 56+7+3 = 23


        double num=24.5673;
        System.out.println(num);

        //String.valueOf() methodu parantezin içine konulan data nin tipini String yapar.

       String str = String.valueOf(num);

        System.out.println(str);

        //Regex icin nokta kullandıgınızda onune "\\" koyunuz. Yani nokta"\\" seklinde kullanılır.

          String decimalPart= str.split( "\\.")[1];
        System.out.println(decimalPart);// 5673

       int decimalInt =  Integer.valueOf(decimalPart);

        System.out.println(decimalInt);//5673

int sum=0;

         do{

             sum = sum + decimalInt%10;
             decimalInt= decimalInt/10;


         }while(decimalInt>0);

        System.out.println(sum);





















    }
}
