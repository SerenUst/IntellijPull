package day17arraylists.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {





                //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
                LocalDate currentDate = LocalDate.now();
                System.out.println(currentDate);// 2022-10-21

                //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
                LocalTime currentTime = LocalTime.now();
                System.out.println(currentTime);// 13:42:32.032258

                //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
                LocalDateTime currentDateTime = LocalDateTime.now();
                System.out.println(currentDateTime);// 2022-10-21T13:46:19.435213

                //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
                LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
                System.out.println(currentDateTimeInJapan);// 2022-10-22T02:51:53.899959

                //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
                LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
                System.out.println(currentDateTimeInIstanbul);// 2022-10-21T20:53:17.682534

                //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.

               LocalDate countDate =LocalDate.of(2022,10,21);

               LocalDate retirdate = countDate.plusDays(789);
        System.out.println(retirdate);//2024-12-18


        //Example7 : ıkı cocugunuzun dogum tarihleri arasındaki farkı gun olarak hesaplayan kodu yazınız.

        LocalDate dobAli=LocalDate.of(2005,5,17);

        LocalDate dobVeli=LocalDate.of(2013,2,8);

        //between(dobALİ,dobVeli) method'u kullanıldıgında daha eski olan tarih once yazılmalıdır

        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);

        System.out.println(diff);//2824

           //Example 8 : Istanbul un fethi ile cumhuriyetin kurulması arasında kac ay old gosteren kodu yazınız.

        LocalDate istabulunFethi = LocalDate.of(1453,5,29);

        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);

        Long aySayisi =ChronoUnit.MONTHS.between(istabulunFethi, cumhuriyetKurulus);
        System.out.println(aySayisi);//5645

        //Example 9 : verilen tarihin hangi burcta old gosteren kodu yazınız

        LocalDate myDate = LocalDate.of(1989,12,7);

        int day = myDate .getDayOfMonth();

        int month = myDate.getMonthValue();

//1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)) {
            System.out.println("Boga");

        }











            }



    }

