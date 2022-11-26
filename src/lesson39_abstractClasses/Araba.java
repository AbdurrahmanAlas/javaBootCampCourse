package lesson39_abstractClasses;

public abstract class Araba {

    // Araba class'ini inherit eden tum class'lar
    // motor,marka, kasa ve tekerlek method'larini override etmek zorunda kalsin

    // ancak abs, klima method'lari opsiyonel olsun
    // isteyen child bu method'lari override etsin, isteyen override etmesin



    public abstract   void motor();

    public  abstract  void marka();
    public abstract   void  kasa();
    public abstract   void  tekerler();

    public void abs(){


        System.out.println("Güvenlik artırmak isteyen arabalar abs kullanmalı");

    }

    public  void klima(){


        System.out.println("Klima mecburi");

    }


}
