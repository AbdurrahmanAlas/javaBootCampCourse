package lesson_Encapsulation;

public class C03_Encapsulations {

    public static void main(String[] args) {

        C02_AEncapsuleClass pers1=new C02_AEncapsuleClass();
       // pers1.hastaneIsmi ="Java hastanesi" private olduğu için kullanamazsın

       // pers1.hemsireAdresi="Ankara"; private olduğundan ulaşılamaz
       // pers1.hemsireIsmi="Ahmet Ahmet";

        System.out.println(pers1.getHastaneIsmi()); //Yıldız Hastanesi

        pers1.setHastaUcreti(590);

        //getter ve setter methodları bazende erişimi sınırlandırmak
        //için degil kullanıcıların işlevi iyi anlaması için
        //kullanılır.

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi());


    }
}
