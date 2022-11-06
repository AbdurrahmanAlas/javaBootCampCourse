package lesson23_constructor;

public class SArabaRunner {

    public static void main(String[] args) {


        SAraba arb1 = new SAraba();

        arb1.marka="Wolksvagen";
        arb1.model="Caddy";
        arb1.fiyat=200;
        arb1.yakit="dizel";
        arb1.yil=2007;

        System.out.println(arb1);


        SAraba arb2=new SAraba("Honda","Civic","Benzin",2011,11505);

        System.out.println(arb2);

        SAraba arb3=new SAraba("Opel","Corsa","Benzin",2009,48484);
        System.out.println(arb3);


        SAraba arb4=new SAraba("Tesla","x",2023);
        System.out.println(arb4);


    }
}