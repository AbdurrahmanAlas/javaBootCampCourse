package lesson27_immutableClassess_DateandTime;

import java.time.LocalDate;

public class C04_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih); //2022/11/13

        System.out.println(tarih.minusDays(100));
        System.out.println(tarih.minusWeeks(5).minusDays(3));
        System.out.println(tarih.plusMonths(5)
                                .plusWeeks(2)
                                 .plusDays(4));


        System.out.println(tarih.getMonthValue()); //11
                System.out.println(tarih.getMonth()); //Novomber

        System.out.println(tarih.getDayOfWeek());// Sunday

        System.out.println(tarih.getDayOfYear());   //320

        System.out.println(tarih.isLeapYear()); //false

        tarih.withYear(2020).withMonth(11).withDayOfMonth(13); //2020 11 13

        tarih.lengthOfYear();//365
        tarih.withYear(2020).lengthOfYear(); //366
        System.out.println(tarih.withYear(1989).withMonth(7).withDayOfMonth(3).getDayOfWeek());

        LocalDate date=LocalDate.of(2022,11,13);
        LocalDate date2=LocalDate.of(2012,2,20);

        System.out.println(date2.isBefore(date)); //true
        System.out.println(date2.isAfter(date)); //false

        System.out.println(tarih.equals(date)); //False


    }
}
