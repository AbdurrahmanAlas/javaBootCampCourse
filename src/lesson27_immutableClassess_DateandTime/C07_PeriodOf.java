package lesson27_immutableClassess_DateandTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        //doğumunuzdan bugune ne kadar zaman geçti



        LocalDate bugun= LocalDate.now();
        LocalDate dogunGunu=LocalDate.of(1989,07,03);

        Period gecensure=Period.between(dogunGunu,bugun);

        System.out.println(gecensure); //
        System.out.println(gecensure.getYears()); //33


    }
}
