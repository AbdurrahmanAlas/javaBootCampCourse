package lesson32_InheritanceConstructor;

public class GAvcıKuslar extends  FKuslar {
    public static void main(String[] args) {


        GAvcıKuslar avci1= new GAvcıKuslar();


        FKuslar avci2= new GAvcıKuslar();


        EHayvanlar avci3= new GAvcıKuslar();


        /*
           Bir child class'da obje olusturmak icin
           child class constructor'i kullanilir.
           Ama data turunu
           o objenin bagli oldugu class'lardan secebiliriz
           Eger constructor ve data turu farkli secilirse
           bu durumda class uyesi olan
           variable ve method'lar farkli davranislar gosterirler
         */

        String str= new String("Kus");

    }

}
