package lesson27_immutableClassess_DateandTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {


        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman);

        System.out.println(zaman.getDayOfMonth());
        System.out.println(zaman.getDayOfYear());


    }
}
