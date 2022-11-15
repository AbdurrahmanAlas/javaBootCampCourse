package lesson29_DateTimeFormatter;

public class C02_StringBuilder {


    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder("Java Candır");
        System.out.println(sb1.reverse()); //ridnaC avaJ

        System.out.println("Tersini yazdırdıktan sonra sb1 :" +sb1 );

        System.out.println(sb1.insert(0, ".")); // .ridnaC avaJ

        System.out.println(sb1); //.ridnaC avaJ
        sb1.reverse();


        StringBuilder sb2=new StringBuilder("Java Candır.");
        String str="Java Candır.";

        System.out.println(sb1==sb2); //false içerik aynı olsa bile falsse verir
        System.out.println(sb1==sb1); //True sadece kendisi ile true verir

        // System.out.println(sb1==str); farklı iki data türü ile karşılaştırılamaz

        System.out.println(sb1.equals(sb2)); // içerik aynı olsa bile false verir

        System.out.println(sb1.compareTo(sb2)); //0
        StringBuilder sb3=new StringBuilder("Hava Candır");
        System.out.println(sb1.compareTo(sb3));//2







    }
}
