package lesson27_immutableClassess_DateandTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

        System.out.println(saat); //12:38:29.249225900

        LocalTime saat2=LocalTime.of(19,10,20);
        System.out.println(saat.compareTo(saat2));

        saat.withNano(4444);


    }
}
