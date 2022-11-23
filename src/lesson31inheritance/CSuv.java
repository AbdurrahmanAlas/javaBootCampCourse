package lesson31inheritance;

public class CSuv extends BinekArac{


    public static void main(String[] args) {


        CSuv suv1=new CSuv();
        System.out.println(suv1.marka); //Binek araçların markası vardır
        System.out.println(suv1.model); //Binek araçların modeli olur.
        System.out.println(suv1.motor); //tüm araçlar motor kullanır
        System.out.println(suv1.plaka); //tüm araçlar plakası vardır
        suv1.hiz("benzin"); //binek araçların hızı modele göre degişir
        suv1.teker();//binek araçların 4 tekeri olur.


        CSuv suv2=new CSuv();
        suv2.marka="MErcedes";
        suv2.model="Travego";
        suv2.motor="1.5";
        suv2.plaka="38 gh 373";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);
        


    }
    public  void  hiz(String yakit){
        
        if(yakit.equalsIgnoreCase("benzin")){

            System.out.println("Benzinlik SUVLERE max 240 km hız yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {

            System.out.println("Dizel suv lar max 200 km hız yapar");
            
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("hibrit 500 km hız yapar");
        }


    }
    
    
    
}
