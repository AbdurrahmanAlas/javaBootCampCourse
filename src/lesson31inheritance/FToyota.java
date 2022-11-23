package lesson31inheritance;

public class FToyota extends EAraba{

    FToyota(){

        super();
        System.out.println("Toyota cons. calıstı.");
    }

    protected String marka="Toyota";
    protected String motor="Toyota araçlar cevreci motor kullanır";
    protected  String uretimYeri="üretim yeri belirtilmemiş";
    protected  int hiz=140;

}
